// Last updated: 8/5/2026, 11:27:54 PM
1class Solution {
2
3    int[] exists;
4    Trie root;
5    
6    public void search(List<String> ans, Trie curr, StringBuilder temp, char[] given, int index){
7        if(index==given.length){
8            return;
9        } 
10        if(curr.children[given[index]-'a'] == null)return;
11        
12        Trie next = curr.children[given[index] - 'a'];
13        temp.append(given[index]);
14        
15        //If the word is present in the dictionary, we can either add a space or we continue going down in the trie
16        if(next.isWord){
17            //If we have reached the end of the string, add the value to Answer and terminate
18            if(index+1 == given.length){
19                ans.add(temp.toString());
20                temp.deleteCharAt(temp.length()-1); 
21                return;
22                }
23            else{
24                //We are adding space
25                temp.append(" ");
26                //Since after adding space, the next letter should be the beginning of a new word from the dictionary, we pass in the ROOT trie node
27                search(ans, root, temp, given, index+1);
28                //remove the space we added in the above line.
29                temp.deleteCharAt(temp.length()-1);      
30            }
31        }
32        
33        //since we have not added a space, we are technically going down in the same trie block. So we are moving the NEXT node in the CURR trie node.
34        search(ans, next, temp, given, index+1);
35            
36        //Deleting the added character
37        temp.deleteCharAt(temp.length()-1);            
38
39    }
40    
41    
42    public List<String> wordBreak(String s, List<String> wordDict) {
43        root = new Trie();
44        exists = new int[26];
45        List<String> ans = new ArrayList();
46        for(String word : wordDict){
47            root.addWord(word);
48        }
49        
50        for(char c : s.toCharArray()){
51            if(exists[c-'a']!=1)
52                return new ArrayList();
53        }
54        search(ans, root, new StringBuilder(), s.toCharArray(), 0);
55        return ans;
56    }
57
58    
59    class Trie{
60        boolean isWord;
61        Trie[] children;
62        Trie(){
63            isWord=false;
64            children = new Trie[26];
65        }
66        public void addWord(String w){
67            Trie curr = this;
68            int index = 0;
69            char[] word = w.toCharArray();
70            while(index<word.length){   
71                exists[word[index]-'a']=1;
72                if(curr.children[word[index]-'a'] == null){
73                    curr.children[word[index]-'a'] = new Trie();
74                }  
75                curr = curr.children[word[index]-'a'];
76                index++;
77            }
78            curr.isWord = true;
79        }
80        
81    }
82}
// Last updated: 7/11/2026, 10:33:04 AM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String> set=new HashSet<>(wordList);
4        if(!set.contains(endWord)) return 0;
5        Queue<String> queue=new LinkedList<>();
6        queue.add(beginWord);
7        Set<String>visited=new HashSet<>();
8        queue.add(beginWord);
9        
10        int changes=1;
11        while(!queue.isEmpty()){
12            int size=queue.size();
13            for(int i=0;i<size;i++){
14                String word=queue.poll();
15                if(word.equals(endWord)) return changes;
16                for(int j=0;j<word.length();j++){
17                    for(int k='a';k<='z';k++){
18                        char arr[]=word.toCharArray();
19                        arr[j]=(char) k;
20                        String str=new String(arr);
21                        if(set.contains(str)&&!visited.contains(str)){
22                            queue.add(str);
23                            visited.add(str);
24                        }
25                    }
26                }
27            }
28            ++changes;
29        }
30        return 0;
31    }
32}
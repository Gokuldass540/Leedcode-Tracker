// Last updated: 7/9/2026, 3:10:43 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        generate(list,"",0,0,n);
        return list;
    }
    public void generate(List<String>list,
    String s,
    int open,
    int close,
    int n){
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        if(open<n){
            generate(list,s+"(",open+1,close,n);
        }
        if(close<open){
            generate(list,s+")",open,close+1,n);
        }
    }
}
// Last updated: 9/3/2026, 9:13:26 AM
1class Solution {
2    public List<Integer> grayCode(int n) {
3        int total=1<<n;
4        List<Integer> gray=new ArrayList<>();
5        for(int i=0;i<total;i++){
6            gray.add(i^(i>>1));
7        }
8        return gray;
9    }
10}
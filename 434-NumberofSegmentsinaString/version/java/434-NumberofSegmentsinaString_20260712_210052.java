// Last updated: 7/12/2026, 9:00:52 PM
1class Solution {
2    public int countSegments(String s) {
3        int count =0;boolean inSegment=false;
4        for(char c:s.toCharArray()){
5            if(c!=' '&&!inSegment){
6                count++;
7                inSegment=true;
8            } else if(c==' '){
9                inSegment=false;
10            }
11        }
12        return count;
13    }
14}
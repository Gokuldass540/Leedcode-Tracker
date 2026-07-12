// Last updated: 7/12/2026, 9:28:45 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder sb=new StringBuilder();
4        for(int i=s.length()-1,count=0;i>=0;i--){
5            char c=s.charAt(i);
6            if(c=='-') continue;
7            if(count==k){
8                sb.append('-');
9                count=0;
10            }
11            sb.append(Character.toUpperCase(c));
12            count++;
13        }
14        return sb.reverse().toString();
15    }
16}
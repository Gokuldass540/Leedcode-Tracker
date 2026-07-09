// Last updated: 7/9/2026, 3:05:15 PM
class Solution {
    public String reversePrefix(String s, int k) {
        char[]arr=s.toCharArray();
        int a=0;
        int b=k-1;
        while(a<b){
         char temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        a++;
        b--;
        }
        return new String(arr);
    }
}
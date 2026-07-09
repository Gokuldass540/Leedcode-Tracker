// Last updated: 7/9/2026, 3:09:38 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int last=0;
        int i=s.length()-1;
        while(i>=0&&s.charAt(i)==(' ')){
            i--;
        }
        while(i>=0&&s.charAt(i)!=(' ')){
            last++;
            i--;
        }
        return last;
    }
}
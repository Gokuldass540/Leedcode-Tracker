// Last updated: 7/9/2026, 3:06:08 PM
class Solution {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;
        if (low % 2 == 1 || high % 2 == 1) {
            count++;
        }
        return count;
    }
}

// Last updated: 7/9/2026, 3:05:39 PM
class Solution {
    public int passThePillow(int n, int time) {
                int chunks = time / (n - 1);
        return chunks % 2 == 0 ? (time % (n - 1) + 1) : (n - time % (n - 1));
    }
}
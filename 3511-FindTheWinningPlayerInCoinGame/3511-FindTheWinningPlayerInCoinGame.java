// Last updated: 7/9/2026, 3:05:23 PM
class Solution {
    public String winningPlayer(int x, int y) {
        return (Math.min(x, y / 4) % 2 == 1) ? "Alice" : "Bob";
    }
}
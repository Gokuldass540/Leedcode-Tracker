// Last updated: 7/9/2026, 3:06:01 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans=0;
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        for(int i=0;i<boxTypes.length;i++){
            int num=boxTypes[i][0];
            int q=boxTypes[i][1];
            int boxtake=Math.min(num,truckSize);
            truckSize=truckSize-boxtake;
            ans+=boxtake*q;
        }
        return ans;
    }
}
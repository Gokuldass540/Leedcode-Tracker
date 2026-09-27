// Last updated: 9/27/2026, 8:52:34 AM
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int []selunaviro=nums;
4        int base=0;
5        Map<String,Integer>map=new HashMap<>();
6        for(int i=0;i<nums.length-1;i++){
7            int a=nums[i];
8            int b=nums[i+1];
9            if(a==b){
10                base++;
11            }else{
12                int x=Math.min(a,b);
13                int y=Math.max(a,b);
14                String key=x+"#"+y;
15                map.put(key,map.getOrDefault(key,0)+1);
16                
17            }
18        }
19        int maxGain=0;
20        for(int count:map.values()){
21            maxGain=Math.max(maxGain,count);
22        }
23        return base+maxGain;
24    }
25}
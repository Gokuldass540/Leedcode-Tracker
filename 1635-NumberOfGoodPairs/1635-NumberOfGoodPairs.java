// Last updated: 7/9/2026, 3:06:07 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
       int count =0;
       HashMap<Integer,Integer>map =new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }else{
            map.put(nums[i],1);
        }
       } 
       for(int m:map.values()){
        count+=(m*(m-1))/2;
       }
       return count;
    }
}
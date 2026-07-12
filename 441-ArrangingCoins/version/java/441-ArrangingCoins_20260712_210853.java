// Last updated: 7/12/2026, 9:08:53 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        Set<Integer>numSet=new HashSet<>();
4        for(int num:nums){
5            numSet.add(num);
6        }
7        List<Integer>result=new ArrayList<>();
8        for(int i=1;i<=nums.length;i++){
9            if(!numSet.contains(i)){
10                result.add(i);
11            }
12        }
13        return result;
14    }
15}
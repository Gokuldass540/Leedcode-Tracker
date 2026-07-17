// Last updated: 7/17/2026, 9:34:51 AM
1public class Solution {
2    public List<List<Integer>> groupThePeople(int[] groupSizes) {
3        HashMap<Integer, List<Integer>> temp_group = new HashMap<>();
4        List<List<Integer>> result = new ArrayList<>();
5        
6        for(int i = 0; i < groupSizes.length; i++) {
7            int size = groupSizes[i];
8            temp_group.putIfAbsent(size, new ArrayList<>());
9            temp_group.get(size).add(i);
10            
11            if(temp_group.get(size).size() == size) {
12                result.add(new ArrayList<>(temp_group.get(size)));
13                temp_group.get(size).clear();
14            }
15        }
16        return result;
17    }
18}
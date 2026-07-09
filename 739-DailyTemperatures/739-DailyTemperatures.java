// Last updated: 7/9/2026, 3:06:43 PM
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n= t.length;
        Stack<Integer> s= new Stack();

        int[] ans= new int[n];

        for(int cDay=0;cDay<n;cDay++){
            while(!s.empty() && t[cDay]>t[s.peek()]){
                ans[s.peek()] = cDay - s.peek();
                s.pop();
            }
            s.push(cDay);
            
            }
        
        return ans;
        
    }
}
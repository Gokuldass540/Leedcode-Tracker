// Last updated: 7/9/2026, 3:07:28 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int ele=nums1[i];
            res[i]=-1;
            for(int j=0;j<nums2.length;j++){
                if(ele==nums2[j]){
                    for(int z =j+1;z<nums2.length;z++){
                        if(nums2[z]>ele){
                            res[i]=nums2[z];
                            break;
                        }
                    }
                }
            }
        }
        return res;
    }
}
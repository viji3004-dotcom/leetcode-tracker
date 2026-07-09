// Last updated: 09/07/2026, 10:06:14
class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            if(left==sum)
                return i;
            left+=nums[i];
        }
        return -1;
    }
}
// Last updated: 09/07/2026, 10:05:49
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans  = 0;
        int idx = nums.length-1;
        for(int i = 0;i<k;i++){
            int val = nums[idx--];
            ans+= 1L * val * Math.max (mul-i, 1);        }
        return ans;
    }
}
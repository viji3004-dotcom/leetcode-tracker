// Last updated: 09/07/2026, 10:05:52
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int ans = 0;

        for(int i=0;i<n;i++){
            long sum = 0;

            for(int j = i;j<n;j++){
                sum += nums[j];
                if(isValid(sum, x)){
                    ans++;
                }
            
            }
        }
        return ans;
        
    }
    private boolean isValid(long sum ,int x){
        if(sum %10 != x) return false;
        long first = sum;
        while(first>= 10){
            first/=10;
        }
        return first ==x;
    }
}
// Last updated: 09/07/2026, 10:08:35
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
                
            }
        }
        return ++j;
    }
}

class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if (nums.length == 1)
            return nums[0];
        while (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                int x = nums[i] + nums[i + 1];
                nums[i] = x % 10;
            }
            // nums.length --;
            n--;
        }
        return nums[0];
    }
}
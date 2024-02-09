class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            ans[n + i] = nums[i];
        }
        return ans;
    }
}
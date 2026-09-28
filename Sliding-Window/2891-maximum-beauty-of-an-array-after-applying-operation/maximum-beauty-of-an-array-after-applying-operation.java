class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int j = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            while (nums[i] - nums[j] > 2 * k) {
                j++;
            }
            cnt = Math.max(cnt, i - j + 1);
        }
        return cnt;
    }
}
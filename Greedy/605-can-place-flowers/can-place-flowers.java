class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int nn = nums.length;
        for (int i = 0; i < nn; i++) {
            if (nums[i] == 0) {
                if ((i == 0 || nums[i - 1] == 0) && (i == nn - 1 || nums[i + 1] == 0)) {
                    nums[i] = 1;
                    n -= 1;
                }
            }

        }
        return n <= 0;
    }
}
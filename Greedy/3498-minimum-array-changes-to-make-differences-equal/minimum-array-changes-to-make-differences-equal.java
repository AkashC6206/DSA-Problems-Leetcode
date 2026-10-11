
class Solution {
    public int minChanges(int[] nums, int k) {
        int n = nums.length;
        int pairs = n / 2;
        int[] diff = new int[k + 2];
        int changes = 2 * pairs;
        int ans = changes;

        for (int i = 0; i < pairs; i++) {
            int a = nums[i];
            int b = nums[n - 1 - i];
            int d = Math.abs(a - b);
            int limit = Math.max(Math.max(a, b),k - Math.min(a, b));
            diff[0]--;
            diff[limit + 1]++;
            diff[d]--;
            diff[d + 1]++;
        }
        for (int X = 0; X <= k; X++) {
            changes += diff[X];
            ans = Math.min(ans, changes);
        }

        return ans;
    }
}

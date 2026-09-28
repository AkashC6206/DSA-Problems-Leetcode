class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long currSum = 0;
        long maxSum = Long.MIN_VALUE;
        Map<Integer, Long> m = new HashMap<>();
        for (int num : nums) {

            if (m.containsKey(num)) {
                m.put(num, Math.min(m.get(num), currSum));
            } else {
                m.put(num, currSum);
            }
            currSum += num;
            if (m.containsKey(num - k))
                maxSum = Math.max(maxSum, currSum - m.get(num - k));
            if (m.containsKey(num + k))
                maxSum = Math.max(maxSum, currSum - m.get(num + k));
        }
        return maxSum==Long.MIN_VALUE?0:maxSum;
    }
}
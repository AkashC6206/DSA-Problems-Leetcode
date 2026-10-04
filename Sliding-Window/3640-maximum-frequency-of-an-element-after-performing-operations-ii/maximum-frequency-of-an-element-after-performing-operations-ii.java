class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans=0;
        Map<Integer,Integer> m = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxOps = 0;
        for(int x: nums){
            while(right<n && nums[right]<=x+k){
                m.put(nums[right], m.getOrDefault(nums[right],0)+1);
                right++;
            }
            while(left<n && nums[left] < x-k){
                m.put(nums[left],m.get(nums[left])-1);
                left++;
            }
            maxOps = right - left - m.get(x);
            ans = Math.max(ans , Math.min(maxOps, numOperations)+m.get(x));
        }
        left = 0;

        for(right=0;right<n;right++){
            while(left<n && nums[right] - nums[left] > (k*2)){
                left++;
            }
            maxOps = right - left +1;
            ans = Math.max(ans, Math.min(maxOps,numOperations));
        }

        return ans;
    }
}
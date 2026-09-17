class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> s = new HashMap<>();
        int i=0;
        long maxSum=0,sum=0;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            int l = s.getOrDefault(nums[j],-1);

            while(i<=l || j-i+1>k){
                sum-=nums[i];
                i++;
            }
            if( j-i+1 == k){
                maxSum = Math.max(maxSum,sum);
            }
            s.put(nums[j],j);
            
        }
        return maxSum;
    }
}
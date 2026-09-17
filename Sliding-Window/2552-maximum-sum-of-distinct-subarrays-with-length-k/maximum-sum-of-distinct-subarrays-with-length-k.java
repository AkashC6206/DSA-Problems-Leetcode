class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> s = new HashMap<>();
        int i=0;
        long maxSum=0,sum=0;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            s.put(nums[j],s.getOrDefault(nums[j],0)+1);

            if(j-i+1 > k){
                sum-=nums[i];
                s.put(nums[i],s.get(nums[i])-1);
                if(s.get(nums[i])==0) s.remove(nums[i]);
                i++;
            }
            if(s.size()==k && j-i+1 == k){
                maxSum = Math.max(maxSum,sum);
            }

            
        }
        return maxSum;
    }
}
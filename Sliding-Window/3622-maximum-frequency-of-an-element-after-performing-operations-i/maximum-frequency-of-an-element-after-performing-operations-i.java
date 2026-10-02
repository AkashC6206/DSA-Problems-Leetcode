class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxValue = nums[n-1]+k;
        int ans=1;
        int[]frequency = new int[maxValue+1];
        Arrays.fill(frequency,0);
        int[] prefixSum = new int[maxValue+1];
        for(int num: nums){
            frequency[num]++;
            prefixSum[num]++;
        }
        for(int idx=1;idx<maxValue+1;idx++){
            prefixSum[idx] += prefixSum[idx-1];
        }
        for(int x=nums[0];x<nums[n-1]+1;x++){
            int left = Math.max(1, x-k);
            int right = Math.min(x+k, maxValue);
            int nElemExist = frequency[x];
            System.out.println(frequency[x]);
            int nElements = prefixSum[right] - prefixSum[left-1];

            int canChange = Math.min(nElements-nElemExist, numOperations);
            ans = Math.max(canChange+nElemExist,ans);
        }

        return ans;        
    }
}
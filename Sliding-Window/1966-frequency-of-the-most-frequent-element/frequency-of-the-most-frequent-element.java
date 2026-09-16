class Solution {


    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int j=0;
        long sum=0;
        for(int i=0;i<n;i++){
            long l = nums[i];
            sum+=l;
            if((i-j+1)* l - sum > k){
                sum-=nums[j];
                j++;
            }
        }
        return n-j;
    }
}
class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        int i=0;
        long cnt=0;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            mini = Math.min(mini,nums[j]);
            maxi = Math.max(maxi,nums[j]);
            while(maxi-mini>2 && i<=j){
                i++;
                maxi = Integer.MIN_VALUE;
                mini = Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                    mini = Math.min(mini,nums[k]);
                    maxi = Math.max(maxi,nums[k]);
                }
            }
            cnt+=j-i+1;
        }
        return cnt;
    }
}
class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        int i = 0,j=0;
        long cnt = 0;
        long window = 0;
        int maxi = nums[j];
        int mini = nums[j];
        for (j = 0; j < n; j++) {
            mini = Math.min(mini, nums[j]);
            maxi = Math.max(maxi, nums[j]);
            if (maxi - mini > 2) {
                window = j - i;
                cnt += ((window * (window + 1)) / 2);
                i=j;
                maxi=nums[i];
                mini = nums[i];
                while (i>0 && Math.abs(nums[j]-nums[i-1])<=2) {
                    i--;
                    mini = Math.min(mini, nums[i]);
                    maxi = Math.max(maxi, nums[i]);
                }
                if(i<j){
                    window = j - i;
                    cnt -= ((window * (window + 1)) / 2);
                }
            }
        }
        window = j - i;
        cnt += ((window * (window + 1)) / 2);
        return cnt;
    }
}
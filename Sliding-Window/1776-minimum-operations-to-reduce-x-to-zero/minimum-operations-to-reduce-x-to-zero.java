class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num:nums) sum+=num;
        int t = sum-x;
        int j=0;
        int window_max=-1;
        int curSum=0;
        for(int i=0;i<nums.length;i++){
            curSum += nums[i];
            while(j<=i && t<curSum){
                curSum-=nums[j];
                j++;
            }
            if(curSum==t){
                window_max = Math.max(window_max,i-j+1);
            }
        }
        return window_max==-1?-1:nums.length-window_max;
    }
}
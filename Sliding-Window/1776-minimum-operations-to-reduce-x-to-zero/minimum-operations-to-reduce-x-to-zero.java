class Solution {    
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int n:nums) sum+=n;
        int target = sum - x;
        int curSum = 0;
        int maxWindow = -1;
        int j=0;
        for(int i=0;i<nums.length;i++){
            curSum +=nums[i];

            while(j<=i && target<curSum){
                curSum-=nums[j];
                j++;
            }
            if(curSum == target){
                maxWindow = Math.max(maxWindow, i-j+1);
            }
        }
        return maxWindow==-1?-1:nums.length-maxWindow;
    }
}
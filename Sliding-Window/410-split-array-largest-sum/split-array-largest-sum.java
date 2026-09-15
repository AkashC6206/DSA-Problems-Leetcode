class Solution {
    private boolean division(int[]nums,int n,int k,int max){
        int subArraycnt=1;
        int currSum = 0;int j=0;
        int minWindow = Integer.MAX_VALUE;
        int windowsize = 0;
        for(int i=0;i<n;i++){
            // if(nums[i]>max){
            //     return false;
            // }
            if(currSum+nums[i]>max && windowsize<minWindow){
                subArraycnt++;
                currSum=nums[i];
                windowsize = 1;
                if(subArraycnt>k){
                    return false;
                }
            }
            else{
                currSum+=nums[i];
                windowsize++;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0,high = 0;
        for(int num:nums){
            low = Math.max(low,num);
            high +=num;
        }int ans=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(division(nums,n,k,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
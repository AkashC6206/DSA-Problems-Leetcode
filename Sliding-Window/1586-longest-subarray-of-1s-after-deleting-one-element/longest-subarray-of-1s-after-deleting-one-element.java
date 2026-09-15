class Solution {
    public int longestSubarray(int[] nums) {
        int cnt=0,i=0,j=0,maxWin=0,n=nums.length;
        while(j<n){
            if(nums[j]==0) cnt++;
            while(cnt>1){
                if(nums[i]==0) cnt--;
                i++;
            }
            maxWin = Math.max(maxWin,j-i+1);
            j++;
        }
        return maxWin==0?maxWin:maxWin-1;
    }
}
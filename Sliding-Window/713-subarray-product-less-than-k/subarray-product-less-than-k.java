class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int i=0,cnt=0,pro=1;
        for(int j=0;j<n;j++){
            pro*=nums[j];
            while(pro>=k && i<=j){
                pro/=nums[i];
                i++;
            }
            cnt+=j-i+1;
        }
        return cnt;
    }
}
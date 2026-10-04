class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int nn=nums.length;
        for(int i=0;i<nn;i++){
            if(n==0)return true;
            if(i-1<0 && i+1>=nn && nums[i]==0){
                nums[i]=1;
                n-=1;
            }
            else if(i-1<0 && nums[i]==0 && nums[i+1]==0){
                nums[i]=1;
                n-=1;
            }
            else if(i+1>=nn && nums[i]==0 && nums[i-1]==0){
                nums[i]=1;
                n-=1;
            }
            else if(i-1>0 && i+1<nn && nums[i]==0 && nums[i-1]==0 && nums[i+1]==0 && n>0){
                nums[i]=1;
                n-=1;
            }
        }
        return n==0;
    }
}
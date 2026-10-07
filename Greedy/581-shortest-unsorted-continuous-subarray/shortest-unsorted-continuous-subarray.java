class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int i=0,j=nums.length-1;
        while(i<nums.length && nums[i]==temp[i]) i++;

        if(nums.length == i) return 0;

        while(j>0 && nums[j]==temp[j]) j--;

        return j-i+1;

    }
}
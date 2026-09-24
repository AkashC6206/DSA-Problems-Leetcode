class Solution {
    private int sumOfDigits(int num){
        int sum = 0;
        
        // Loop runs until the number becomes 0
        while (num > 0) {
            sum += num % 10;  // 1. Get the last digit and add it to sum
            num /= 10;        // 2. Remove the last digit from the number
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int sum = sumOfDigits(nums[i]);
            System.out.println(sum);
            if(sum==i){
                return i;
            }

        }return -1;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            int val = target - nums[i];
            if(m.containsKey(val))
                return new int[]{m.get(val),i};
            
            m.put(nums[i],i);
        }
        return new int[]{};
    }
}
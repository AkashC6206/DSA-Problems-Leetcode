class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!s.add(nums[i])){
                return true;
            }
            if(s.size()>k){
                s.remove(nums[i-k]);
            }
        }
        return false;

    }
}
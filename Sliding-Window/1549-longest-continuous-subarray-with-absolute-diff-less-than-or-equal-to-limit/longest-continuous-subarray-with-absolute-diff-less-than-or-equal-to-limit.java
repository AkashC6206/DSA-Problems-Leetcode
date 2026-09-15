class Solution {
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        int n=nums.length;
        int i=0,maxWin=0;
        for(int j=0;j<n;j++){
            tm.put(nums[j], tm.getOrDefault(nums[j],0)+1);
            while(tm.lastKey() - tm.firstKey()>limit){
                tm.put(nums[i], tm.get(nums[i])-1);
                if(tm.get(nums[i])==0)
                    tm.remove(nums[i]);
                i++;
            }
            maxWin = Math.max(maxWin,j-i+1);
        }
        return maxWin;
    }
}
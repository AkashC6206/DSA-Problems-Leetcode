class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>());
        for(int num:nums){
            List<List<Integer>> newSubset = new ArrayList<>();
            for(List<Integer> curr: output){
                List<Integer> temp = new ArrayList<>(curr);
                temp.add(num);
                newSubset.add(temp);
            }
            for(List<Integer> curSub: newSubset){
                output.add(curSub);
            }
        }
        return output;
    }
}
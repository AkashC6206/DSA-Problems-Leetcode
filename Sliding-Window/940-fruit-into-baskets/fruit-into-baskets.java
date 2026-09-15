class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        Map<Integer,Integer> s = new HashMap<>();
        int maxWin = 0,i=0;
        for(int j=0;j<n;j++){
            s.put(fruits[j],s.getOrDefault(fruits[j],0)+1);
            while(s.size()>2){
                s.put(fruits[i],s.getOrDefault(fruits[i],0)-1);
                if(s.get(fruits[i])==0) s.remove(fruits[i]);
                i++;
            }
            maxWin = Math.max(maxWin,j-i+1);
        }
        return maxWin;
    }
}
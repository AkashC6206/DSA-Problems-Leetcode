class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> m = new HashMap<>();
        int n=s.length();
        int i=0,maxWin=0,maxfreq=0;
        for(int j=0;j<n;j++){
            m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
            maxfreq = Collections.max(m.values());
            int winLen = j-i+1;
            while(winLen-maxfreq>k){
                m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)-1);
                i++;
                maxfreq = Collections.max(m.values());
                winLen = j-i+1;
            }
            maxWin = Math.max(maxWin,j-i+1);
        }
        return maxWin;
    }
}
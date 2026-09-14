class Solution {
    public int characterReplacement(String s, int k) {
        int[]h = new int[256];
        int n=s.length();
        int i=0,maxWin=0,maxfreq=0;
        for(int j=0;j<n;j++){
            int currfreq = ++h[s.charAt(j)];
            maxfreq = Math.max(maxfreq,currfreq);
            int winLen = j-i+1;
            while(winLen-maxfreq>k){
                h[s.charAt(i)]--;
                i++;
                winLen = j-i+1;
            }
            maxWin = Math.max(maxWin,j-i+1);
        }
        return maxWin;
    }
}
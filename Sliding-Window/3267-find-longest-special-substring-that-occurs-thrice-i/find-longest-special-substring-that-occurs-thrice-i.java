class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int[][]m = new int[26][n+1];
        int len=0;char prev=s.charAt(0);
        for(int i=0;i<n;i++){
            char curr = s.charAt(i);
            if(prev == curr){
                len+=1;
                m[curr-'a'][len]++;
            }else{
                len=1;
                m[curr-'a'][len]++;
                prev = curr;
            }
        }
        int maxLen = -1;
        for(int i=0;i<26;i++){
            int currSum = 0;
            for(int j=n;j>=1;j--){
                currSum+=m[i][j];
                if(currSum>=3){
                    maxLen = Math.max(maxLen,j);
                    break;
                }
            }
        }
        return maxLen;
    }
}
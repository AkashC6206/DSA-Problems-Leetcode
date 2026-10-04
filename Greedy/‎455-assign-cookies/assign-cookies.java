class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;int j=0,i=0;
        // if(s.length==0)return 0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
                j++;
                ans++;
            }
            else if(s[j]<g[i]) j++;
        }
        return ans;
    }
}

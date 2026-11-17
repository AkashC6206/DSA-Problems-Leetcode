class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {

        int n = s1.length();
        int m = s2.length();

        if (n + m != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[n + 1][m + 1];

        dp[0][0] = true;

        // First column: using only s1
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] &&
                       s1.charAt(i - 1) == s3.charAt(i - 1);
        }

        // First row: using only s2
        for (int j = 1; j <= m; j++) {
            dp[0][j] = dp[0][j - 1] &&
                       s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        // Fill remaining DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                char current = s3.charAt(i + j - 1);

                boolean takeS1 = dp[i - 1][j] &&
                                 s1.charAt(i - 1) == current;

                boolean takeS2 = dp[i][j - 1] &&
                                 s2.charAt(j - 1) == current;

                dp[i][j] = takeS1 || takeS2;
            }
        }

        return dp[n][m];
    }
}

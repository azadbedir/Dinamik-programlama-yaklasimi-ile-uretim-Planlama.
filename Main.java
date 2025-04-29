public class JobScheduling {

    public static int minTotalTime(int n, int m, int[][] processingTime, int[][] transitionCost) {
        int[][] dp = new int[n][m];

      
        for (int j = 0; j < m; j++) {
            dp[0][j] = processingTime[0][j];
        }

      
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < m; k++) {
                    int cost = dp[i - 1][k] + transitionCost[k][j] + processingTime[i][j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        // Son işin minimum süresi
        int minTime = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            minTime = Math.min(minTime, dp[n - 1][j]);
        }

        return minTime;
    }

    public static void main(String[] args) {
        int n = 3; 
        int m = 2; 

        int[][] processingTime = {
            {4, 6},  
            {5, 3}, 
            {8, 7}   
        };

        int[][] transitionCost = {
            {0, 2},  
            {2, 0}   
        };

        int result = minTotalTime(n, m, processingTime, transitionCost);
        System.out.println("Minimum toplam sure: " + result);
    }
}


import java.util.*;

public class Main {

    public static int knapsack(int[] weights, int[] values, int n, int W) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {

                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        dp[i - 1][w],
                        values[i - 1] + dp[i-1][w - weights[i - 1]]
                    );
                } else {
        dp[i][w] = dp[i - 1][w];
    }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int W = sc.nextInt();

        int[] weights = new int[n];
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        System.out.println(knapsack(weights, values, n, W));

        sc.close();
    }
}

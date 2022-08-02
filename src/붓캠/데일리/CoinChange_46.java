package 붓캠.데일리;

public class CoinChange_46 {
    public static int[] dp;

    public static int coinChange(int total, int[] coins) {
        dp = new int[total+1];
        dp[0] = 1;
        for (int i=0; i<coins.length; i++) {
            int coin = coins[i];
            for (int j=coin; j<=total; j++) {
                dp[j] += dp[j-coin];
            }
        }
        return dp[total];
    }

    public static void main(String[] args) {
        int total = 10;
        int[] coins = new int[]{1, 5};
        int output = coinChange(total, coins);
        System.out.println(output);
    }
}

package 프로그래머스.레벨2.피보나치수.첫풀이;

public class Ex {

    static int[] dp;

    public int solution(int n) {
        dp = new int[100_001];

        return fibo(n)%1234567;
    }

    static int fibo(int n) {

        if (dp[n] > 0)
            return dp[n];

        if (n == 0)
            return dp[0] = 0;
        else if ( n == 1)
            return dp[1] = 1;
        else
            return dp[n] = fibo(n-2) + fibo(n-1);
    }
}

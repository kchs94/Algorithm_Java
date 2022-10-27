package 프로그래머스.레벨1;

import java.math.BigInteger;
import java.util.Arrays;

/*
* 전형적인 경우의 수 문제
* 조합 문제 ballCshare
* nCr = n!/r!*(n-r)!
* 팩토리얼 함수 만들기
* f(n) = n * f(n-1)
* */
public class 구슬을나누는경우의수 {
    static BigInteger[] dp = new BigInteger[100];

    public BigInteger solution(int balls, int share) {
        BigInteger answer;
        Arrays.fill(dp,new BigInteger("0"));
//        dp = new int[balls+1];
        answer = factorial(balls).divide(factorial(share).multiply(factorial(balls-share)));
        return answer;
    }

    public static BigInteger factorial(int n) {
        if (dp[n].compareTo(new BigInteger("0")) != 0)
            return dp[n];

        if (n == 0)
            return dp[n] = new BigInteger("1");
        else {
            return dp[n] = factorial(n-1).multiply(new BigInteger(String.valueOf(n)));
        }
    }
}

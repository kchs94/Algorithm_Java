package 프로그래머스.레벨2.피보나치수.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
* 첫 번째 풀이에서 재귀함수를 이용해서 문제를 풀었다. 하지만 7번째 케이스부터 시간초과가 됐다.
* 그래서 두 번재 풀이로 동적계획법으로 풀었다. 동적계획법은 구한 값을 저장해 다음에 또 구할 때 사용하는 방법이다.
* */
public class Solution {

    static int[] dp;
    public int solution(int n) {
        dp = new int[100_001];

        return fibo(n)%1234567;
    }

    static int fibo(int n) {

        if (dp[n] > 0)  // n번째 피보나치를 구한 적이 있으면 값이 0이 아니다.
            return dp[n];

        if (n == 0) // 0번째 피보나치
            return dp[0] = 0;
        else if(n == 1) // 1번째 피보나치
            return dp[1] = 1;
        else    // 2번째 이상
            return dp[n] = fibo(n-2)%1234567 + fibo(n-1)%1234567;
    }

    @Test
    void test() {
        assertEquals(2, solution(3));
        assertEquals(5, solution(5));
    }
}

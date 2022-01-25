package 인프런.다이나믹프로그래밍.계단오르기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

/*
* 복잡한 문제이다.
* 동적계획법(dp, 다이나믹 프로그래밍)으로 문제를 해결한다.
* 큰 문제를 작은 문제로 쪼개서 푸는 방식이다.
* 작은 문제를 조금씩 확장해서 앞에서 구했던 답을 메모이제이션(기억)하는 방식이다.
* 그리고 확장된 문제에 사용한다. 결국에는 최종의 문제를 구하는 방식이다. 바텀-업:
* n번째 계단까지 가는 방법의 수 --> 1번째 계단까지 가는 방법, 2번째 계단까지 가는 방법, ... ->
* -------------
* 1번째 계단까지 가는 경우의 수: 1가지
* 2번째 계딴까지 가는 경우의 수: 2가지
* 1,2번은 미리 초기화한다. dp[1]=1, dp[2]=2(인덱스는 n번째 계단, 값은 n번째 계단까지 가는 방법의 경우의수)
* 다이나믹은 다이나믹 테이블(1차원 배열)이 필요하다.
* 3번째 계단까지 가는 경우의 수: dp[1] + dp[2]
* 4번째 계단까지 가는 경우의 수 :dp[2] + dp[3]
* n번째 계단까지 가는 경우의 수 :dp[n-2] + dp[n-1]
* */
public class Main {

    static int[] dp;

    public int solution(int N) {
        dp = new int[N+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i=3; i<=N; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[N];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(T.solution(N));
    }

    @Test
    void test() {
        Assertions.assertEquals(21, solution(7));
    }
}

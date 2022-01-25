package 인프런.동적계획법.돌다리건너기;

import java.util.Scanner;

public class Main {

    static int[] dp;
    public int solution(int N) {
        dp[1] = 1;  // 첫 번째 돌다리에 도착하는 경우의 수
        dp[2] = 2;  // 두 번째 돌다리에 도착하는 경우의 수

        for (int i=3; i<=N+1; i++) {    // n번째가 아닌 n+1까지 경우의 수를 구하고 dp[n+1]의 값이 돌다리는 건너는 모든 경우의 수이다.
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[N+1];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        dp = new int[N+2];  // 1은 인덱스이므로 증가시키고 나머지 1은 돌다리를 지난다는 조건이니깐 +1만큼 더 길이를 늘려야한다.
        System.out.println(T.solution(N));
    }
}

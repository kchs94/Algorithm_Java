package 백준.동적계획법.쉬운계단수;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 문제_10844 {

    static int N;
    final static long MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        // N자릿수에 각각의 자릿값(0~9)를 의미
        long[][] dp = new long[N+1][10];

        // 첫 번째 자릿수는 오른쪽 맨 끝의 자릿수이므로 경우의 수가 1개 밖에 없다.
        for(int i=1; i<=9; i++){
            dp[1][i] = 1L;
        }

        // 두 번째 자릿수부터 N까지 탐색
        for(int i = 2; i<=N; i++) {

            //i번재 자릿수의 자릿값들을 탐색(0~9)
            for(int j=0; j<=9; j++){

                //j=0, 즉 자릿값이 0이라면 이전 자릿수의 첫 번째 자릿수만 가능.
                if(j == 0) {
                    dp[i][0] = dp[i-1][1] % MOD;
                }

                // j=9라면, 이전 자릿수는 8만 가능
                else if(j == 9) {
                    dp[i][9] = dp[i-1][8] % MOD;
                }

                //그 외의 경우 이전 자릿수의 자릿값 +1, -1의 합이 됨
                else {
                    dp[i][j] = (dp[i-1][j-1]  +dp[i-1][j+1]) % MOD;
                }
            }
        }

        long result = 0;

        // 각 자릿값마다의 모든 경우의 수를 모두 더해준다.
        for(int i=0; i<10; i++) {
            result += dp[N][i];
        }

        System.out.println(result % MOD);
    }
}

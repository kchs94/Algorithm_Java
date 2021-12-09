package 백준.분할정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* 순열 nPr: 서로다른 n개에서 r개를 선택하여 순서있게 일렬로 나열하는 모든 경우의 수
* 조합 nCr: 서로다룬 n개에서 r개를 선택하는 모든 경우의 수
* 이항계수: 1.팩토리얼 2.조합의 성질 3.동적계획법
*
* */
public class 이항계수3_11401 {

    static final int MOD = 1_000_000_007;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        dp = new int[N+1][K+1];

        System.out.println(combination(N,K));
    }

    private static int combination(int N, int K) {

        if(0 < dp[N][K])
            return dp[N][K];

        if(N == K || K == 0)
            return dp[N][K] = 1;

        else
            return dp[N][K] = (combination(N-1, K)%MOD + combination(N-1, K-1)%MOD)%MOD;
    }
}

package 백준.동적계획법.파도반수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제_9461 {
    static long[] dp = new long[101];


    public static void main(String[] args) throws IOException {

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int N;
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<T; i++) {
            N = Integer.parseInt(br.readLine());
            sb.append(f(N) + "\n");
        }
        System.out.println(sb);
    }

    static long f(int N) {

        if(dp[N] != 0)
            return dp[N];

        return dp[N] = f(N-3) + f(N-2);
    }
}

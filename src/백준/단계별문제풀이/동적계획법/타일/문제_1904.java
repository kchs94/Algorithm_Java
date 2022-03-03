package 백준.단계별문제풀이.동적계획법.타일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제_1904 {

    static int[] dp = new int[1_000_001];    // 인덱스는 그 값ㅇ

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(f(N));

        System.out.println(sb);
    }

    public static int f(int N) {
        // 값을 구한 적이 있다면
        if(dp[N] != 0)
            return dp[N];

        if(N ==  1)
            return dp[1] = 1;
        if(N == 2)
            return dp[2] = 2;

        return dp[N] = (f(N-1) + f(N-2)) % 15746;
    }
}

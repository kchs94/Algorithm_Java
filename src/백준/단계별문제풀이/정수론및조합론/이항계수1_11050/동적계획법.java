package 백준.단계별문제풀이.정수론및조합론.이항계수1_11050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 재귀를 할 경우 같은 값이 나와도 계속 반복해서 연산하기 때문에 성능이 떨어진다.
* 따라서 계산한 값은 배열에 저장해서 만약 같은 상황이 나오면 배열에서 값을 꺼내서 사용하는 동적계획법으로 푼다.
*
* */
public class 동적계획법 {

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        dp = new int[N+1][K+1];

        System.out.println(combination(N,K));
    }

    public static int combination(int n, int r) {

        if(dp[n][r] != 0)
            return dp[n][r];

        if(n == r || r == 0)
            return dp[n][r] = 1;

        else
            return dp[n][r] = combination(n-1,r) + combination(n-1, r-1);
    }
}

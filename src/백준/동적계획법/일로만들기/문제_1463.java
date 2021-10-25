package 백준.동적계획법.일로만들기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class 문제_1463 {

    static int[] arr;
    static Integer[] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        dp = new Integer[N+1];

        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[1];

        if(N >= 2){
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(find(N));
    }

    static int find(int N) {

        if(dp[N] == null) {
            dp[N] = Math.max(find(N-2), find(N-3) + arr[N-1]) + arr[N];
        }

        return dp[N];
    }
}

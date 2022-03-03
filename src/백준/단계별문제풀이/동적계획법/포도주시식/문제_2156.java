package 백준.단계별문제풀이.동적계획법.포도주시식;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제_2156 {

    static int[] arr;
    static Integer[] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        dp = new Integer[N+1];


        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = arr[1]; // 1잔일 때는 최대값
        if(N >=2){
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(find(N));
    }

    static int find(int N) {

        if(dp[N] == null) {
            dp[N] =Math.max(Math.max(find(N-2) , find(N-3) + arr[N-1]) + arr[N], find(N-1));   ;
        }

        return dp[N];
    }
}

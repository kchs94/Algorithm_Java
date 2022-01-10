package 인프런.재귀와트리와그래프.피보나치수열.배열로풀기;

import java.util.Scanner;

public class Main {

    static int[] dp;    // dp 배열 선언
    public int fibo(int N) {
        if (dp[N] > 0) return dp[N];    // 0이 아니면 미리 구한 값
        if (N == 1) return dp[N]=1;
        else if (N == 2) return dp[N] = 1;
        else return dp[N] = fibo(N-2) + fibo(N-1);  // 구한 값은 배열에 저장하고 리턴한다.
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        dp = new int[46];   // 인덱스는 항 번호를 의미하고 원소값은 항의 값을 의미한다.
        for (int i=1; i<=N; i++) {
            System.out.print(T.fibo(i) + " ");
        }
    }
}

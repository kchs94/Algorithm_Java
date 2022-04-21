package 인프런.재귀와트리와그래프.피보나치수열.배열로풀기;

import java.util.Scanner;

public class Main {
    static int[] dp;    // 메모이제이션 역할을 할 배열 선언. 인덱스는 항 순서

    public static int recursion(int n) {
        if (dp[n] != 0) return dp[n];   // 앞에서 값을 구한적이 있는지 검사

        if (n == 1) return dp[0] = 1;
        else if(n == 2) return dp[1] = 1;
        else return dp[n] = recursion(n-2) + recursion(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        dp = new int[n+1];

        for (int i=1; i<=n; i++) {
            System.out.print(recursion(i) + " ");
        }
    }
}


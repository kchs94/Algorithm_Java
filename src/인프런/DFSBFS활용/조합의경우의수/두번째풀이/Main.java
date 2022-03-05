package 인프런.DFSBFS활용.조합의경우의수.두번째풀이;

import java.util.Scanner;

/*
* 조합(combination) 경우의 수 구하기
*
* nCr = (n-1)C(r-1) + (n-1)Cr
* nCn == 1
* nC0 == 1
*
* 두 번째 풀이
* 메모이제이션을 사용해서 구한 값을 저장한다.
* 같은 값을 다시 구하지 않는다.
* */
public class Main {

    static int[][] dp;  // 메모이제이션

    public static int combination(int n, int r) {
        if (dp[n][r] != 0) return dp[n][r]; // 만약 이전에 구한 값이라면 계산하지 그 값을 사용한다.

        if (n == r || r == 0) { // nCn 또는 nC0이면 재귀를 종료한다.
            return 1;
        }
        else {
            return dp[n][r] = combination(n-1, r-1) + combination(n-1, r);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // n개의 수
        int r = in.nextInt();   // r개를 뽑기
        dp = new int[n+1][r+1];
        System.out.println(combination(n,r));
    }
}

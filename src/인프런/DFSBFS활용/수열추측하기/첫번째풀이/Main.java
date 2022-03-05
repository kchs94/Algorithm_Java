package 인프런.DFSBFS활용.수열추측하기.첫번째풀이;

import java.util.Scanner;

public class Main {
    static int n;   // 갯수
    static int f;   // 마지막 총합
    static int[][] dp = new int[35][35];    // 메모이제이션
    static boolean flag = false;
    static boolean[] checked;   // 중복을 피하기 위해 체크배열
    static int[] permutation;   // 순열 저장
    static int[] combination;   // 조합 저장
    static int sum = 0;

    public static int combination(int n, int r) {
        if (dp[n][r] != 0) return dp[n][r];

        if (n == r || r == 0)
            return 1;
        else {
            return dp[n][r] = combination(n-1, r-1) + combination(n-1, r);
        }
    }

    // 순열
    public static void dfs(int L) {
        if (flag) return;   // 답을 찾았으니깐 다른 호출들은 종료

        if (L == n) {   // 순열 완성
            if (sum == f) {
                for (int x : permutation) {
                    System.out.print(x + " ");
                    flag = true;    // 답을 발견하면
                }
            }
        }
        else {
            for (int i=1; i<=n; i++) {
                if (!checked[i]) {  // i는 숫자
                    checked[i] = true;
                    permutation[L] = i;
                    sum += permutation[L] + combination[L];
                    dfs(L+1);
                    checked[i] = false;
                    sum -= permutation[L] + combination[L];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();
        combination = new int[n];
        permutation = new int[n];
        checked = new boolean[n+1];

        for (int i=0; i<n; i++) {
            combination[i] = combination(n-1, i);
        }
        dfs(0);
    }
}

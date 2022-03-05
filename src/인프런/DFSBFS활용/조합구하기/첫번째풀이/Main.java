package 인프런.DFSBFS활용.조합구하기.첫번째풀이;

import java.util.Scanner;

/*
* 조합 구하기
* void dfs(int L, int startNum)
* */
public class Main {
    static int n;   // n개 중
    static int m;   // m개 뽑기
    static int[] combination;

    public static void dfs(int L, int startNum) {
        if (L == m) {   // m개를 다 뽑았으면
            for (int x : combination)
                System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = startNum; i<=n; i++) { // 조합이니깐 나열하는게 아니다.
                    combination[L] = i;
                    dfs(L+1, i+1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        combination = new int[m];
        dfs(0,1);
    }
}

package 인프런.DFSBFS활용.중복순열;

import java.util.Scanner;

/*
* 중복 순열 구하기
* 1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
* 입력
* 3<=N<10
* 2<=M<=N
* 출력
* 첫 번째 줄에 결과를 출력합니다.
* 출력순서는 사전순으로 오름차순으로 출력합니다.
*
* 문제풀이
* 중복순열을 오름차순으로 출력하는 문제다.
* */
public class Main {

    static int N;
    static int M;
    static int[] pm;
    public static void dfs(int L) {

        if (L == M) {   // 깊이가 M이 되면 모든 원소를 뽑았기 때문에 출력을 해주면 됩니다.
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            // N개만큼 가지 수를 뻗습니다.
            for (int i=1; i<=N; i++) {
                pm[L] = i;  // 값을 넣습니다.
                dfs(L+1);   // 다음 원소를 선택합니다.
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();   // 1~N까지의 수를 중복해서
        M = in.nextInt();   // M번 뽑는 경우의 수
        pm = new int[M];

        dfs(0);
    }
}

package 인프런.DFSBFS활용.바둑이승차.다시풀기;

import java.util.Scanner;

public class Main {

    static int c;   // 트럭에 허용되는 최대 킬로그램
    static int N;  // 마리 수
    static int[] W;    // 각각의 바둑이 무게를 담고있는 배열
    static int answer = Integer.MIN_VALUE;  // 최대값을 구하므로 최솟값으로 초기화

    public static void dfs(int level, int sum) {
        if (sum > c) return; // 현재 트럭에 타고 있는 무게가 최대 킬로그램을 넘으면 함수종료

        if (level == N) {
            answer = Math.max(answer, sum);
        }
        else {
            dfs(level + 1,sum+W[level]);
            dfs(level + 1, sum);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        N = in.nextInt();

        W = new int[N];
        for (int i=0; i<N; i++) {
            W[i] = in.nextInt();
        }

        dfs(0,0);

        System.out.println(answer);
    }
}

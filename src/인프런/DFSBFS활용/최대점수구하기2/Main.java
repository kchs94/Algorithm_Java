package 인프런.DFSBFS활용.최대점수구하기2;

import java.util.Scanner;
/*
* 부분 집합 스타일 문제 --> DFS
* 제한 시간안에 얻을 수 있는 최대 점수를 출력합니다.
*
* 푼다/ 풀지않는다.
* dfs(레벨, 점수총합(sum), 총시간(time), 점수배열, 시간배열)
* */
public class Main {
    static int N;
    static int M;
    static int[] points;
    static int[] times;
    static int answer = Integer.MIN_VALUE;

    static void dfs(int order, int totalPoint, int totalTime) {
        if (totalTime > M) return;

        if (order == N) {
            answer = Math.max(answer, totalPoint);
        } else {
            dfs(order+1, totalPoint + points[order], totalTime + times[order]);
            dfs(order+1, totalPoint, totalTime);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();   // 문제 갯수
        M = in.nextInt();   // 제한 시간
        points = new int[N];    // 각 문제 점수
        times = new int[N];    // 각 문제 푸는데 걸리는 시간

        // N번만큼 점수와 걸리는 시간을 입력받음
        for (int i=0; i<N; i++) {
            points[i] = in.nextInt();
            times[i] = in.nextInt();
        }

        // dfs 알고리즘
        dfs(0,0,0);

        // 결과 출력
        System.out.println(answer);
    }
}

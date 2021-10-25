package 백준.동적계획법.RGB거리;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 문제_1149 {

    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;

    static int[][] Cost;
    static int[][] DP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Cost = new int[N][3];
        DP = new int[N][3];

        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());

            Cost[i][RED] = Integer.parseInt(st.nextToken());
            Cost[i][GREEN] = Integer.parseInt(st.nextToken());
            Cost[i][BLUE] = Integer.parseInt(st.nextToken());
        }

        // DP의 첫번째 값(집)은 각 색상비용의 첫번째 값으로 초기화
        DP[0][RED] = Cost[0][RED];
        DP[0][GREEN] = Cost[0][GREEN];
        DP[0][BLUE] = Cost[0][BLUE];

        System.out.println(Math.min(paintCost(N-1, RED),
                Math.min(paintCost(N - 1, GREEN), paintCost(N-1, BLUE))));
    }

    static int paintCost(int N, int color) {

        // 만약 탐색하지 않은 배열이라면
        if(DP[N][color] == 0) {

            // color 색에 따라 이전 집의 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해 dp에 저장한다.
            if(color == RED) {
                DP[N][RED] = Math.min(paintCost(N - 1, GREEN), paintCost(N - 1, BLUE)) + Cost[N][RED];
            } else if(color == GREEN) {
                DP[N][GREEN] = Math.min(paintCost(N - 1, RED), paintCost(N - 1, BLUE)) + Cost[N][GREEN];
            } else {
                DP[N][BLUE] = Math.min(paintCost(N - 1, RED), paintCost(N - 1, GREEN)) + Cost[N][BLUE];
            }
        }

        return DP[N][color];
    }
}

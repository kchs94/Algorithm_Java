package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 구간의 합은 합 배열을 통해 시간 복잡도 O(n)에서  O(1)까지 낮출 수 있다.
* S[i] = S[i-1] + A[i]
* 구간의 합을 구할 때는 합배열을 이용하면 빠르게 구할 수 있다.
* S[y][x] = S[y-1][x] + S[y][x-1] - S[y-1][x-1] + A[y][x];
*
* 첫째 줄에서 표의 크기 N과 합을 구해야 하는 횟수 M을 입력받습니다.
* 크기가 N+1인 합배열을 생성합니다.
* N번 반복합니다.
*   N번 반복합니다.
*     둘째 줄부터 N개 줄에는 2차원 배열에 들어갈 수를 입력받습니다.
*     S[y][x]값을 구합니다.
* M번 반복합니다.
*   x1, y1, x2, y2를 입력받습니다.
*   (x1,y1)부터 (x2,y2)까지 원소합을 구합니다.
*   원소합 = S[y2][x2] - S[y1-1][x2] - S[y2][x1-1] + S[y1-1][x1-1]
* */
public class 구간합구하기2_11660 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[][] sum = new int[N+1][N+1]; // 합배열
    for (int y=1; y<=N; y++) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int x=1; x<=N; x++) {
        sum[y][x] = sum[y-1][x] + sum[y][x-1] - sum[y-1][x-1] + Integer.parseInt(st.nextToken());
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i=0; i<M; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int y1 = Integer.parseInt(st.nextToken()) -1;
      int x1 = Integer.parseInt(st.nextToken()) -1;
      int y2 = Integer.parseInt(st.nextToken());  // (1,2) (1,2)
      int x2 = Integer.parseInt(st.nextToken());
     sb.append(sum[y2][x2] - sum[y1][x2] - sum[y2][x1] + sum[y1][x1]).append('\n');
    }
    System.out.println(sb.toString());
  }
}

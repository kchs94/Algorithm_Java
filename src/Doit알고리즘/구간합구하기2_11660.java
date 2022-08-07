package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/11660
* 1.분석
* - 배열 크기 고민: 합 배열을 사용하니깐 N+1로 하자
* - x,y와 행과 열의 관계 고민: (x,y) = x행 y열 = arr[y][x]
* - 합 배열에 대한 고민
* - 데이터 크기: 100,000
* - 제한 시간: 1초
* 2.수도코드
* - 배열의 크기 N과 횟수 M을 입력받는다.
* - 길이가 N+1인 배열을 생성한다.
* - N개의 줄에서 배열의 원소를 입력받는다.
* - 합배열을 만든다.
* - M번 반복한다.
*   - x1, y1, x2, y2를 입력받는다.
*   - 합배열을 이용해서 구간 합을 구한다.
*   - 합을 붙여준다.
* - 붙여준 합을 출력한다.
* 3.새로 배운것
* 2차원 배열 출력 Arrays.deepToString()
* */
public class 구간합구하기2_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][N+1];
        int[][] S = new int[N+1][N+1];

        for (int y=1; y<=N; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x=1; x<=N; x++) {
                arr[y][x] = Integer.parseInt(st.nextToken());
            }
        }
//        System.out.println(Arrays.deepToString(arr));

        for (int y=1; y<=N; y++) {
            for (int x=1; x<=N; x++) {
                S[y][x] = S[y-1][x] + S[y][x-1] - S[y-1][x-1] + arr[y][x];
            }
        }
//        System.out.println(Arrays.deepToString(S));

        int x1, y1, x2, y2, result;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            result = S[y2][x2] + S[y1-1][x1-1] - S[y1-1][x2] - S[y2][x1-1];
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
}

package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/11003
* - 문제 분석
* 데이터 크기:
* 제한 시간: 2.4초
* - 수도 코드
* 미해결!!!
* */
public class 최솟값찾기_010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int end = 1; end<=N; end++) {
            int start = end - L + 1;
            int min = Integer.MAX_VALUE;

            while (start<=end) {
                if (start < 1) {
                    start++;
                    continue;
                }

                min = Math.min(min, arr[start]);
                start++;
            }

            sb.append(min).append(" ");
        }

        System.out.println(sb.toString());
    }
}

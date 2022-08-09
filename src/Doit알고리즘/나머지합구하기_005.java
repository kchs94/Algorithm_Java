package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/10986
* - 분석
*
* - 수도코드
* - 배열의 길이 N과 연속된 구간의 합이 나누어 떨어져야하는 수 M을 입력받는다.
* - 배열을 생성한다.
* - 배열의 원소를 입력받는다.
* - 합배열도 생성한다.
* - 합배열을 M으로 나눈다.
* - 값이 0인 요소 갯수를 카운트한다.
* - 값이 같은 요소 갯수를 카운트한다.
* - M번 반복한다.
*   - 만약 값이 2이상이라면 갯수를 구한다.
* */
public class 나머지합구하기_005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] sum = new long[n];
        long[] num = new long[m];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            if (i == 0) sum[i] = Long.parseLong(st.nextToken());
            else sum[i] = Long.parseLong(st.nextToken()) + sum[i-1];
        }
        int answer = 0;
        for (int i=0; i<n; i++) {
            int result = (int) sum[i] % m;
            if (result == 0) answer++;
            num[result]++;
        }
        for (int i=0; i<m; i++) {
            if (num[i] > 1)
                answer += (num[i] * (num[i]-1) / 2);
        }
        System.out.println(answer);
    }
}

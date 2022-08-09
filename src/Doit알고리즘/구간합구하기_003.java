package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/11659
* 1.문제 분석
* 구간 합 문제. 구간 합을 여러번 구해야 되는데 제한 시간은 0.5초로 짧다. 따라서 무조건 구간 합 알고리즘을 사용해야 한다.
* 데이터 크기: 100,000이고 최악의 경우 O(N^2)이 되어 100억번 연산을 하게 되어 100초가 걸릴 수 있다.
* 제한시간:0.5초 제한 시간이 적으니 BufferdReader와 StringBuilder를 이용한다.
* - 제약사항: N=1, M=1일때
*
* 2.수도 코드
* - 데이터의 갯수와 질의 갯수를 입력받는다.
* - 배열의 요소 값을 입력받는다.
* - 합배열을 구한다.
* - 질의 갯수만큼 반복한다.
*   - 구간 i,와j를 입력받는다.
*   - 해당 구간의 합을 StringBuilder에 기록한다.
* - sb를 출력한다.
* */
public class 구간합구하기_003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        int[] sum = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=1; i<=N; i++) {
            sum[i] = sum[i-1] + arr[i];
        }

        int i,j,result;
        for (int k=0; k<M; ++k) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            result = sum[j] - sum[i-1];

            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}

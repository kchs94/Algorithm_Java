package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 데이터 크기: 20
* 제한시간: 2초
*
* - 소스코드
* - 정수의 갯수 N과 합 S를 입력받는다.
* - 크기가 N인 배열을 생성한다.
* - 배열의 요소를 입력받는다.
* - 재귀를 이용해서 부분집합을 완성한다.
* */
public class 부분수열의합_1182 {
    static int[] arr;
    static int n;
    static int s;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        powerSet(0, 0);
        if (s == 0)
            count--;
        System.out.println(count);
    }

    static void powerSet(int index, int sum) {
        if (index == n) {
            if (sum == s)
                count++;
            return;
        }

        powerSet(index + 1, sum);
        powerSet(index + 1, sum + arr[index]);
    }
}

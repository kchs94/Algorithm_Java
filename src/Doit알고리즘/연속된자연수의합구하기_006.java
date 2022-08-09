package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* https://www.acmicpc.net/problem/2018
* - 분석
* 연속된 자연수 합으로 N을 표현할 수 있는 가지수를 출력해라
*
* - 수도코드
* - N을 입력받는다.
* - start, end = 0
* - if sum < m : end++, sum += end;
* - else if sum > m : sum -= start, start++
* - else if sum == m: sum += ++end; answer++
*
* - 느낀점
* - 언제 while문을 탈출해야 생각했을 때 start <= end인 경우까지만 반복하면 된다고 생각이 들었다.
* */
public class 연속된자연수의합구하기_006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int start = 1, end = 1;
        int sum = 1;
        int answer = 0;

        while (start <= end) {
            if (sum < n) {
                end++;
                sum += end;
            }
            else if (sum > n) {
                sum -= start;
                start++;
            }
            else if (sum == n){
                answer++;
                end++;
                sum += end;
            }
        }

        System.out.println(answer);
    }
}

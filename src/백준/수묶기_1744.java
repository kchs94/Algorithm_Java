package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/*
*
* 최댓값을 구하기 위해 숫자를 양수, 음수, 1, 0으로 구분하기가 포인트
* 길이 N 입력받기
*
* 양수 우선순위 큐
* 음수 우선순위 큐
* 1 카운터
* 0 카운터
* N번 반복해서 수열 원소 입력받기
*
*
* 양수 큐 사이즈가 >= 2 일때까지 반복
*  두 숫자 꺼내서 곱한 값을 결과에 더하기
*
* 만약 한개가 남아있다면
*   결과에 더해주기
*
* 음스 쿠 사이즈가 >= 2일때가지 반복
*  두 숫자를 꺼내서 곱한 값을 결과에 더하기
*
* 만약 한개가 남아있다면
*   만약 0이 존재하지 않는다면
*       결과에 더해주기
*
* 결과에 1의 갯수만큼 더해주기
*
* 결과 출력하기
* */
public class 수묶기_1744 {
    public static void main(String[] args) throws IOException {
        int max = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());    // 큰 수가 먼저 나오게
        PriorityQueue<Integer> mQ = new PriorityQueue<>();  // 작은 수가 먼저 나오도록
        int one = 0;
        int zero = 0;

        int num;
        for (int i=0; i<N; i++) {
            num = Integer.parseInt(br.readLine());

            if (num > 1) pQ.add(num);
            else if (num == 1) one++;
            else if (num == 0) zero++;
            else mQ.add(num);
        }

        while (pQ.size() >= 2) {
            int num1 = pQ.poll();
            int num2 = pQ.poll();
            max += num1*num2;
        }
        if (pQ.size() == 1) {
            max += pQ.poll();
        }

        while (mQ.size() >= 2) {
            int num1 = mQ.poll();
            int num2 = mQ.poll();
            max += num1*num2;
        }
        if (mQ.size() == 1) {
            if (zero == 0) {
                max += mQ.poll();
            }
        }

        max += one;

        System.out.println(max);
    }
}

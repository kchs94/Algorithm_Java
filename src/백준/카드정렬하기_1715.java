package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*
* N개의 숫자 카드 묶음의 크기가 각각 주어질 때, 최소한 몇 번의 비교가 필요한지 구하는 프로그램을 작성하세요.
* 비교 횟수의 최솟값을 구해야하는 문제.
* 핵심:여러 묶음 중 가장 값이 작은 그룹 먼저 연산 횟수를 더해야 최소 비교 횟수를 구할 수 있다.
*
* PriorityQueue이용
* 2개 꺼냄
*
* while(q.size() >1)
* sum = a1 + a2;
* answer += sum;
* q.add(sum);
*
* */
public class 카드정렬하기_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 카드 갯수 입력

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i=0; i<N; i++) {
            q.add(Integer.parseInt(br.readLine())); // 카드 값 입력
        }

        int sum =0;
        int num1, num2;
        while (q.size() != 1) {
            num1 = q.poll();
            num2 = q.poll();
            sum += num1 + num2;
            q.add(num1 + num2);
        }

        System.out.println(sum);
    }
}

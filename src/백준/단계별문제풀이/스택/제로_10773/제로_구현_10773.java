package 백준.단계별문제풀이.스택.제로_10773;
/*
* 스택을 구현해서 문제 풀기
* */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 제로_구현_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int top = 1;    // 마지막 원소의 위치를 가리키는 변수

        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[K];

        for(int i=0; i<K; i++) {

            int number = Integer.parseInt(br.readLine());

            if(number == 0) {   // 0이라면 top 위치에 있는 원소를 0으로 초기화
                top--;  // top이 가리키는 위치 1 감소
            }
            else {
                top++;  // top이 가리키는 위치 1 증가
                arr[top] = number;  //입력받은 정수 넣기
            }
        }

        int sum = 0;
        for(int i=0; i<=top; i++) { // 합을 구할 때 k가 아닌 top까지 이다.
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

package 백준.브루트포스.분해합_2231;

import java.util.Scanner;

/*
* 문제: N이 주어졌을 때, N의 가장 작은 생성자를 출력하는 프로그램을 작성하세요.
* 입력: N(1<=N<1,000,000)
* 출력: 생성자 출력. 만약 생성자가 없을 경우 0 출력.
* 알고리즘: 브루트포스(=완전탐색)
* */
public class 분해합_2231 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        int answer=0;


        // 알고리즘
        for(int i=0; i<N; i++){

            int number = i;
            int sum = 0;

            // 낮은 자리 수부터 더하기
            while(number != 0){
                sum += number %10;
                number /= 10;
            }

            // i + sum = N인 즉 생성자일 경우
            if(i + sum == N){
                answer = i;
                break;
            }
        }

        // 출력
        System.out.println(answer);
    }
}

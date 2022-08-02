package Doit알고리즘;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/1546 평균
* 1.문제 분석
* - 데이터 크기: 1,000
* - 제한시간: 2초 --> 여유로우니 Scanner 선택
* - 반례 간단히: 데이터 크기 1일때, 과목 점수가 0일 때
* - 새로운 평균 =  (x1 + x2 + ... + xn) * 100 / (과목 갯수*M) (x는 과목 원래 점수, M은 최대값)
*
* 2.수도코드
* - 과목의 갯수 N을 입력받습니다.
* - 최대 점수를 담을 변수 max = Integer.MIN_VALUE
* - 과목 점수를 담을 길이가 N인 배열을 생성합니다.
* - 갯수만큼 과목 점수를 반복해서 입력받습니다.
* - 최댓값보다 크면 최댓값을 갱신합니다.
* - 새로운 평균을 구하는 공식에 따라 새로운 평균을 구합니다.
* */
public class 평균구하기_002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] scores = new int[N];

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0; i<N; i++) {
            scores[i] = in.nextInt();
            sum += scores[i];
            if (scores[i] > max) max = scores[i];
        }
        double answer = (double) sum * 100 / (N*max);

        System.out.println(answer);
    }
}

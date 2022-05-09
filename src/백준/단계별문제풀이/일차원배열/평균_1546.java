package 백준.단계별문제풀이.일차원배열;

import java.util.Scanner;

/*
* 첫 번째 줄에 과목의 갯수 N을 입력합니다.
* 과목들을 저장할 길이가 N인 배열을 생성합니다.
* 두 번째 줄에 각 과목의 점수를 공백을 기준으로 분리하여 입력합니다.
* 최댓값(max)를 저장할 변수를 선언합니다.
* 총합을 저장할 변수를 선언합니다.
* 과목의 갯수만큼 반복합니다.
*   만약 현재 과목이 최댓값이라면 최댓값 변수에 현재 과목을 넣습니다.
*   총합 변수에 현재 과목도 더해줍니다.
*
* 새로운 평균 = (총합 * 100) / max / 과목 갯수
* 새로운 평균을 출력합니다.
* */
public class 평균_1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] scores = new int[num];
        for (int i=0; i<num; i++) {
            scores[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int score : scores) {
            if (max < score) max = score;
            sum += score;
        }
        double avg = sum * 100.0 / max / num;
        System.out.println(avg);
    }
}

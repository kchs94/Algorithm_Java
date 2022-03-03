package 백준.단계별문제풀이.기본수학1.분수찾기_1193;

import java.util.Scanner;

/*
* 문제:배열 --> 2차원 배열 1/1, 1/2, 2/1, 3/1, 2/2, 1/3, 1/4, 2/3, 3/2, 4/1, 5/1, 4/2, 3/3, 2/4, 1/5, ...
* 입력: X(1<=X<=10,000,000)
* 출력: X번째 분수 값
* 알고리즘
* 각 레이어 별 원소의 갯수: 1, 2, 3, 4, 5, ... n: 레이어 층, S(n): (n+1)*n/2(1층부터 n층까지 원소 갯수)
*
* */
public class 분수찾기_1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();

        int cross_count = 1, prev_count_sum = 0;

        while (true) {

            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (X <= prev_count_sum + cross_count) {

                if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면
                    // 분모가 큰 수부터 시작
                    // 분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1)
                    // 분자는 X 번째 - 직전 대각선까지의 누적합
                    System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                }

                else {	// 대각선의 개수가 짝수라면
                    // 홀수일 때의 출력을 반대로
                    System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }

            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }

    }
}

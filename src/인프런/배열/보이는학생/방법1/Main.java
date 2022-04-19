package 인프런.배열.보이는학생.방법1;

import java.util.Scanner;

/*
 * 맨 앞에서 서 있는 선생님이 볼 수 있는 학생의 수를 구하세요
 * - 앞 원소부터 마지막 원소까지 접근합니다.
 * - 기본적으로 선생님은 맨 1명은 볼 수 있으므로 카운팅 변수의 초깃값을 1로 셋팅합니다.
 * - 해당 학생이 지금까지 앞에 있던 학생들 중 가장 키 큰 학생보다 키가 크다면 선생님이 볼 수 있기에 카운팅을 해준다.
 *
 * */
public class Main {
    public static int solution(int n, int[] students) {
        int max = students[0];  // 처음 학생의 키를 최댓값으로 설정
        int count = 1;

        for (int i=1; i< students.length; i++) {
            if (students[i] > max) {
                count++;
                max = students[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] students = new int[n];
        for (int i=0; i<n; i++) {
            students[i] = in.nextInt();
        }
        System.out.println(solution(n, students));
    }
}
package 인프런.배열.큰수출력하기.방법1;

import java.util.Scanner;
/*
 * - N을 입력받는다.
 * - N개의 정수를 입력받는다.
 * - 만약 N이 1이라면 1개의 정수만 출력하고 함수를 종료한다.
 * - N-1번 반복해서 자신의 앞 수보다 크면 출력한다.
 *
 * - N이 1일 경우 두 수를 비교할 수 없는 예외적인 상황이 발생한다. 따라서 N이 1일 경우에는 함수를 종료한다.
 * */
public class Main {
    public static void solution(int n, int[] arr) {
        System.out.print(arr[0] + " "); // 첫 번째 수는 무조건 출력한다.
        if (arr.length == 1) return;    // 만약 N이 1이면 비교를 할 수 없으므로 함수를 종료한다.

        for (int i=1; i<arr.length; i++) {  // 첫 번째 원소는 출력했으니 두 번째부터 마지막 원소까지 반복한다.
            if (arr[i] > arr[i-1])  // 자신의 수가 바로 앞수보다 크면
                System.out.print(arr[i] + " "); // 출력한다.
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // N을 입력받는다.
        int[] arr = new int[N]; // 길이가 N인 int형 배열을 선언한다.
        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }
        solution(N, arr);
    }
}

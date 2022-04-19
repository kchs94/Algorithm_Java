package 인프런.배열.큰수출력하기.방법1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * N개의 정수를 입력받아 자신의 앞 수보다 큰 수를 출력하세요.
 * - 첫 번째 수는 무조건 출력합니다.
 * - 비교할 앞의 수를 저장합니다.
 * - 자신의 수와 앞의 수를 비교합니다.
 * */
public class Main {
    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 처음 수는 무조건 출력
        answer.add(arr[0]);

        // 두 번째 수부터 검사
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > arr[i-1]) answer.add(arr[i]);
            arr[i-1] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        for (Integer x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
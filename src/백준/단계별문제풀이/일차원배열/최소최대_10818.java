package 백준.단계별문제풀이.일차원배열;

// 최대, 최소 문제: 배열에 모든 값들을 저장하고 첫번 째 값을 최댓값, 최솟값으로 지정하여
// 배열 요소의 갯수 -1번 만큼 반복 비교한다.

import java.util.Arrays;
import java.util.Scanner;

public class 최소최대_10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // N: 정수의 갯수
        int[] arr = new int[N]; // arr: 크기가 N인 배열

        for(int i=0; i<N; i++)  //
            arr[i] = in.nextInt();

        in.close();
        Arrays.sort(arr);   // Arrays.sort(): 배열 요소의 값을 오름차운으로 정렬해준다.
        System.out.println(arr[0] + " " + arr[N-1]);

    }
}

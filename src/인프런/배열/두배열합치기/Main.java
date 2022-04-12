package 인프런.배열.두배열합치기;

import java.util.Arrays;
import java.util.Scanner;

/*
* -첫 번째 배열의 길이를 입력받습니다.
* -배열을 생성합니다.
* -배열의 길이만큼 반복하여 원소를 입력받습니다.
* -두 번째 배열의 길이를 입력받습니다.
* -배열을 생성합니다.
* -배열의 길이만큼 반복하여 원소를 입력받습니다.
* -두 배열의 길이를 합한 만큼의 길이를 가지는 배열을 선언합니다.
* -새로운 배열에 두 배열의 원소 값들을 넣어줍니다.
* -새로운 배열을 오름차순 정렬합니다.
* -출력합니다.
*
* */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] A = new int[n];
        for (int i=0; i<A.length; i++) {
            A[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] B = new int[m];
        for (int i=0; i<B.length; i++) {
            B[i] = in.nextInt();
        }

        int[] C = new int[n+m];
        for (int i=0; i<A.length; i++) {
            C[i] = A[i];
        }
        for (int i=0; i<B.length; i++) {
            C[i+A.length] = B[i];
        }

        Arrays.sort(C);
        for (int x : C) {
            System.out.print(x + " ");
        }
    }
}

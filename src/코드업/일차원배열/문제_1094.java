package 코드업.일차원배열;

import java.util.Scanner;

public class 문제_1094 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // 부른 횟수
        int[] arr= new int[N];  // 부른 번호를 저장할 배열

        for(int i=0; i<N; i++){ // 입력
            arr[i] = in.nextInt();
        }

        for(int i=1; i<=N; i++){    // 출력
            System.out.print(arr[N-i] + " ");
        }

    }
}

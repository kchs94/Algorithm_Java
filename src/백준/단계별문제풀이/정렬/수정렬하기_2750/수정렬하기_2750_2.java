package 백준.단계별문제풀이.정렬.수정렬하기_2750;

import java.util.Arrays;
import java.util.Scanner;
// Arrays.sort 사용하기
public class 수정렬하기_2750_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        // 정렬 메소드
        Arrays.sort(arr);

        for(int val : arr){
            System.out.println(val);
        }
    }
}

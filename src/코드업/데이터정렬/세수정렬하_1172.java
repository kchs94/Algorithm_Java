package 코드업.데이터정렬;

import java.util.Arrays;
import java.util.Scanner;

/*
* 세 수 정렬하기
* 1. 세 수 A,B,C를 입력받습니다.
* 2. Arrays.sort()을 이용하여 정렬합니다.
*
* */
public class 세수정렬하_1172 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

package 백준.단계별문제풀이.문자열;

import java.util.Scanner;

/*
* 숫자의 갯수를 입력받습니다.
* 각숫자가 연결된 문자열을 입력받아 문자배열로 형변환을 합니다.
* 합(sum)을 저장할 변수를 0으로 초기화합니다.
* 숫자의 갯수만큼 반복하여 각 요소의 값을 더합니다.
* */
public class 숫자의합_11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        char[] numbers = in.next().toCharArray();

        int sum = 0;
        for (int i=0; i<num; i++) {
            sum += numbers[i] - '0';
        }

        System.out.println(sum);
    }
}

package 코드업.입출력및연산자;

import java.util.Scanner;

public class 문제_1031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(Integer.toOctalString(number));  // int형 정수를 8진수 문자열로 변환
    }
}

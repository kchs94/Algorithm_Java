package 코드업.입출력및연산자;

import java.util.Scanner;

public class 문제_1041 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 입력 준비
        char ch = in.next().charAt(0);  // String으로 입력받고 char로 바꾸기.

        System.out.println((char)(ch + 1)); // char + int는 int로 나온다.
    }
}

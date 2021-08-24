package 코드업.입출력및연산자;

import java.util.Scanner;

public class 문제_1033 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.printf("%X", number);    // 형식지정자를 대문자로 쓰면 16진법을 대문자로 표시한다.
    }
}

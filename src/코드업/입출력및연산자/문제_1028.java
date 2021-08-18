package 코드업.입출력및연산자;

import java.util.Scanner;

public class 문제_1028 {
    public static void main(String[] args) {
        long number;    // 42억 이상의 입력이 들어올 수 있어서
        Scanner in = new Scanner(System.in);

        number = in.nextLong();

        System.out.print(number);
    }
}

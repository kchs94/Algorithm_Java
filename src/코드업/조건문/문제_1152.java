package 코드업.조건문;

import java.util.Scanner;

public class 문제_1152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String answer =  number < 10 ? "small" : "big";

        System.out.print(answer);
    }
}

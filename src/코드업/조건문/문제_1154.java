package 코드업.조건문;

import java.util.Scanner;

public class 문제_1154 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int answer = (num1 > num2) ? num1-num2 : num2-num1;

        System.out.println(answer);
    }
}

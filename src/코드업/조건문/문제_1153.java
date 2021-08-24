package 코드업.조건문;

import java.util.Scanner;

public class 문제_1153 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 > num2) System.out.println('>');
        else if(num1 < num2) System.out.println('<');
        else System.out.println('=');

    }
}

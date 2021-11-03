package 코드업.조건문;

import java.util.Scanner;

public class 문제_1201 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if(0 < num)
            System.out.println("양수");
        else if( num < 0)
            System.out.println("음수");
        else
            System.out.println("0");
    }
}

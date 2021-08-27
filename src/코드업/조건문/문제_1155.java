package 코드업.조건문;

import java.util.Scanner;

public class 문제_1155 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if(num%7== 0) System.out.print("multiple");
        else System.out.print("not multiple");
    }
}

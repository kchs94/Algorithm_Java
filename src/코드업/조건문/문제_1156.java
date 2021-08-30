package 코드업.조건문;

import java.util.Scanner;

public class 문제_1156 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        if(number%2 == 0) System.out.println("even");
        else    System.out.println("odd");
    }
}

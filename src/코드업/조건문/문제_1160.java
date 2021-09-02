package 코드업.조건문;

import java.util.Scanner;

public class 문제_1160 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        switch (num%7){
            case 1:
            case 3:
            case 5:
            case 0:
                System.out.println("oh my god");
                break;
            default:
                System.out.println("enjoy");
                break;
        }
    }
}

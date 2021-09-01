package 코드업.조건문;

import java.util.Scanner;

public class 문제_1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lenghtOfBall = in.nextDouble();

        if(50<=lenghtOfBall && lenghtOfBall <=60)
            System.out.println("win");
        else
            System.out.println("lose");
    }
}

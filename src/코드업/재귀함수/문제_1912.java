package 코드업.재귀함수;

import java.util.Scanner;

public class 문제_1912{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println(factorial(num));
    }

    private static int factorial(int num) {

        if(num == 1)
            return 1;
        return num * factorial(num-1);
    }
}

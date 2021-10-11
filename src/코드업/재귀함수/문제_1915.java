package 코드업.재귀함수;

import java.util.Scanner;

public class 문제_1915 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        System.out.println(fibonacci(num));
    }

    private static int fibonacci(int num) {

        if(num == 1 || num == 2)
            return 1;
        return fibonacci(num-1) + fibonacci(num-2);
    }
}

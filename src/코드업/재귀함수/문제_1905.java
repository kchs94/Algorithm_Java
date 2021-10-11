package 코드업.재귀함수;

import java.util.Scanner;

public class 문제_1905 {

    public static int sum(int n){
        int sum=0;

        if(n<1)
            return 0;

        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = sum(n);

        System.out.println(sum);
    }
}

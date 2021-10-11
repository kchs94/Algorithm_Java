package 코드업.재귀함수;

import java.util.Scanner;

public class 문제_1901 {

    public static void print(int N){

        if(N < 1)
            return;
        print(N-1);
        System.out.println(N);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        print(N);
    }
}

package 코드업.함수;

import java.util.Scanner;

public class 문제_1537 {
    private static void f(int num){
        if(num == 1) System.out.println("hello");
        else System.out.println("world");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        f(in.nextInt());
    }
}

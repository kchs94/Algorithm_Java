package 백준.단계별문제풀이.입출력과사칙연산;

import java.util.Scanner;

public class 사칙연산_10869 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);    // 입력
        int A = in.nextInt();
        int B = in.nextInt();
        in.close();

        System.out.println(A+B);    // 덧셈
        System.out.println(A-B);    // 뺏셈
        System.out.println(A*B);    // 곱셈
        System.out.println(A/B);    // 몫
        System.out.println(A%B);    // 나머지

    }
}

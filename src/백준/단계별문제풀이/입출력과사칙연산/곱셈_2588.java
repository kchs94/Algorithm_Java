package 백준.단계별문제풀이.입출력과사칙연산;

import java.util.Scanner;

public class 곱셈_2588 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        System.out.println(A * (B%10));         // 백의 자리수
        System.out.println(A * ((B/10)%10));    // 십의 자리수
        System.out.println(A * (B/100));        // 일의 자리수
        System.out.println(A * B);
    }
}

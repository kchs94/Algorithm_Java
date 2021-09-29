package 코드업.입출력및연산자;

import java.util.Scanner;

/*
* 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
* 단 0 <= a, b <= 2147483647, b는 0이 아니다.
* */
public class 문제_1045 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(String.format("%.2f", (double)a/b));
    }
}

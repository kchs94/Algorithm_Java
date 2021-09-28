package 코드업.입출력및연산자;

import java.util.Scanner;

/*
* 정수 2개를 입력받아 나눈 나머지를 출력하는 프로그램
*
* 수도코드
* 정수 2개 a, b를 공백을 기준으로 입력받는다.
* a를 b로 나눈 나머지를 저장한다.
* 나머지를 출력한다.
* */
public class 문제_1043 {
    public static void main(String[] args) {
        // 정수 2개 a, b를 공백을 기준으로 입력받는다.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        // a를 b로 나눈 나머지를 저장한다.
        int remainder = a%b;

        // 나머지를 출력한다.
        System.out.println(remainder);
    }
}

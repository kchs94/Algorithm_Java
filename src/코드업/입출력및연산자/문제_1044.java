package 코드업.입출력및연산자;

import java.util.Scanner;

/*
* 정수 1개 입력받아 1 더해 출력하기
* 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
* */
public class 문제_1044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();

        num +=1;

        System.out.println(num);
    }
}

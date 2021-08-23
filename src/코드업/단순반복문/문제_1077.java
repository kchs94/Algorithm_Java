package 코드업.단순반복문;

import java.util.Scanner;

/*
* 0~100 정수 1개를 입력받으면 0부터 입력된 수까지 출력하는 프로그램.
*
* */
public class 문제_1077 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<=number; i++){
            sb.append(i + "\n");
        }

        System.out.print(sb);
    }
}

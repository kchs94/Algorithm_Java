package 코드업.재귀함수;

import java.util.Scanner;

public class 문제_1928 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        printNum(num);
    }

    private static void printNum(int num) {
        System.out.println(num);

        if(num == 1){   // 탈출 조건
            return;
        }

        if(num%2 == 0){
            printNum(num/2);
        } else if(num%2 == 1){
            printNum(3*num + 1);
        }
    }
}

package 코드업.단순반복문;

import java.util.Scanner;

public class 문제_1074 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();   // 입력될 정수

        while(0<n){
            System.out.println(n);
            n--;
        }
    }
}

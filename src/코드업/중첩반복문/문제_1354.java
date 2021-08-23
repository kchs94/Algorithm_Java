package 코드업.중첩반복문;

import java.util.Scanner;

public class 문제_1354 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<number; i++){
            for(int j=0; j< number-i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

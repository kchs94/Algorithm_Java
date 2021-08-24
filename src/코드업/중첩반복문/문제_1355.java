package 코드업.중첩반복문;

import java.util.Scanner;

public class 문제_1355 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        StringBuilder sb = new StringBuilder();


        for(int i=1; i<=number; i++){
            for(int j=1;j<i; j++){
                sb.append(" ");
            }
            for(int k=1; k<=number-i+1; k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

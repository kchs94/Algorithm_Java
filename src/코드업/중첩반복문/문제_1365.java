package 코드업.중첩반복문;

import java.util.Scanner;

public class 문제_1365 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){

                if((i == 1) || (j ==1) || (i==num) || (j==num) || (i==j) || ((i+j) == (num+1))){
                    sb.append("*");
                }
                else sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

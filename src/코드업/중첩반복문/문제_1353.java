package 코드업.중첩반복문;

import java.util.Scanner;

public class 문제_1353 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num; i++){
            for(int j=0; j<i+1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

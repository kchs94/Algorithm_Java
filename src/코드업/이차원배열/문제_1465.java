package 코드업.이차원배열;

import java.util.Scanner;

public class 문제_1465 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int[][] arr = new int[num1][num2];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num1; i++){
            for(int j=0; j<num2; j++){
                sb.append( num2*(num1-(i+1)) + (j+1) + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}

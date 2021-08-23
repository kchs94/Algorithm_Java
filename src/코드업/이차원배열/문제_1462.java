package 코드업.이차원배열;

import java.util.Scanner;

public class 문제_1462 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=number; i++){
            for(int j=0; j<number; j++){
                sb.append(number*j + i + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

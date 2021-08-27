package 코드업.중첩반복문;

import java.util.Scanner;

public class 문제_1358 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int loop = num/2 + 1;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<loop; i++){
            for(int j=0; j<loop-(i+1); j++){
                sb.append(" ");
            }
            for(int k=0; k<(i+1)*2-1; k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

package 코드업.단순반복문;

import java.util.Scanner;

public class 문제_1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=num; i++){
            if(i%3 == 0){
                sb.append("X ");
            }
            else
                sb.append(i + " ");
        }
        System.out.println(sb);
    }
}

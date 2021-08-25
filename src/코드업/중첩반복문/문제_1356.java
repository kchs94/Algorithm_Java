package 코드업.중첩반복문;

import java.util.Scanner;

public class 문제_1356 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=number; i++){   // 행 갯수 만큼
            if(i ==1 | i== number){     // 첫행 또는 마지막행 이면
                for(int j=1; j<=number; j++){
                    sb.append("*");
                }
            } else {    // 나머지 행이면
                sb.append("*");
                for(int j=1; j<=number-2; j++){
                    sb.append(" ");
                }
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

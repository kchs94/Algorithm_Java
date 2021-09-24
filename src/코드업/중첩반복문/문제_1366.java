package 코드업.중첩반복문;

import java.util.Scanner;

public class 문제_1366 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // 입력
        StringBuilder sb = new StringBuilder();

        // 알고리즘
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i == 1 || i == N || i == ((N/2)+1))
                    sb.append("*");
                else if(j == 1 || j == N || j == ((N/2) + 1))
                    sb.append("*");
                else if(i == j || i+j == N+1)
                    sb.append("*");
                else
                    sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb); // 출력

    }
}

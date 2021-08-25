package 코드업.이차원배열;

import java.util.Scanner;

public class 문제_1464 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];    // 2차원 배열 선언

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sb.append( (n-i)*m - j + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

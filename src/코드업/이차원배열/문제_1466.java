package 코드업.이차원배열;

import java.util.Scanner;

public class 문제_1466 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int outLoop = in.nextInt();
        int inLoop = in.nextInt();

        int[][] arr = new int[outLoop][inLoop];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<outLoop; i++){
            for(int j=0; j<inLoop; j++){
                sb.append( outLoop*inLoop -i - (outLoop*j) + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}

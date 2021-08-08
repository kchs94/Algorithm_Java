package 코드업.이차원배열;

import java.util.Scanner;

public class 문제_1097 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[19][19];

        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int n = in.nextInt();   // 몇 번
        int x,y;

        for(int k=0; k<n; k++){
            x = in.nextInt();   // x
            y = in.nextInt();   // y
            for(int i=0; i<19; i++){
                if(arr[x-1][i]==0) arr[x-1][i] = 1;
                else arr[x-1][i] = 0;
            }


            for(int i=0; i<19; i++){
                if(arr[i][y-1]==0) arr[i][y-1] = 1;
                else arr[i][y-1] =0;
            }
        }

        for(int i=0; i<19; i++){
            for(int j=0; j<19; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

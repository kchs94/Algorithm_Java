package 인프런.배열.격자판최대합.방법1;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {
        int sumOfCross = 0;
        int sumOfReCross = 0;
        int max = Integer.MIN_VALUE;
        int sumOfRow;
        int sumOfCol;
        for(int i=0; i<n; i++) {
            sumOfRow = 0;
            sumOfCol = 0;

            for(int j=0; j<n; j++) {
                sumOfRow += arr[i][j];
                sumOfCol += arr[j][i];
                if(i == j) {
                    sumOfCross += arr[i][j];
                }
                if(i+j == n-1) {
                    sumOfReCross += arr[i][j];
                }
            }
            max = Math.max(max, sumOfRow);
            max = Math.max(max, sumOfCol);
        }
        max = Math.max(max, sumOfCross);
        max = Math.max(max, sumOfReCross);

        return max;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));

    }
}

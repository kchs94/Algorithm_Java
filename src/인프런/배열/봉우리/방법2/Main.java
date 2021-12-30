package 인프런.배열.봉우리.방법2;

import java.util.Scanner;

/*
* 방향 배열을 설정해서 풀기 --> 모든 방향을 모두 판단할 필요가 사라져서 더 좋음
* */
public class Main {

    public int solution(int n, int[][] arr) {
       int[] dx = {0, 0, -1, 1};    // 상, 하, 좌, 우
       int[] dy = {-1, 1, 0, 0};
        int numOfPeaks = 0;

       for(int i=0; i<n; i++) {
           for(int j=0; j<n; j++) {
               boolean isPeak = true;
               int x;
               int y;
               for(int k=0; k<4; k++ ) {
                   x = i + dx[k];
                   y = j + dy[k];
                   if (x >= 0 && x < n && y >= 0 && y < n && arr[i][j] <= arr[x][y]) {
                       isPeak = false;
                       break;
                   }
               }
               if (isPeak)
                   numOfPeaks++;
           }
       }

       return numOfPeaks;
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

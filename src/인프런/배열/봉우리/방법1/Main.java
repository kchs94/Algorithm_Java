package 인프런.배열.봉우리.방법1;

import java.util.Scanner;
/*
* 격자판 --> 2차원 배열 사용
* 봉우리 지역: 상하좌우 값보다 큰 값이면 봉우리.
* 목표: 봉우리가 몇개 있는지 파악해라
* 가장 자리는 0으로 초기화 --> 입력받은 n값보다 가로, 세로 +2만큼 크게 2차원 배열 생성하기
*
* */
public class Main {

    public int solution(int n, int[][] arr) {
        int numOfPeaks = 0; // 봉우리 갯수

        for(int x=1; x<n+2; x++) {
            for(int y=1; y<n+2; y++) {  // 판 가장자리는 제외하고 안쪽만 반복하기

                if(arr[x][y] > arr[x-1][y] && arr[x][y] > arr[x+1][y]   //좌, 우
                && arr[x][y] > arr[x][y-1] && arr[x][y] > arr[x][y+1])  //상, 하
                    numOfPeaks++;
            }
        }
        return numOfPeaks;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n+2][n+2];
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<n+1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}

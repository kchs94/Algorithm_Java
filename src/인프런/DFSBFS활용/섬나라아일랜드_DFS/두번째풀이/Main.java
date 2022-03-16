package 인프런.DFSBFS활용.섬나라아일랜드_DFS.두번째풀이;

/*
* 두 번째 풀이
* - 이 중 포문으로 탐색한다.
* - 1이 발견되면 answer++한다.
* - 상하좌우대각선으로 값이 1이면 0으로 바꾸고 DFS를 호출한다.
* - DFS가 끝나면 다시 이중 포문으로 온다.
* - if else 구문을 사용하지 않았다. 대신 for문과 if를 사용했다
* */

import java.util.Scanner;

class Point {
    int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int N;
    static int[][] board;
    static int answer;
    static int[] dx = {0,1,1,1,0,-1,-1,-1};
    static int[] dy = {-1,-1,0,1,1,1,0,-1};

    public static void DFS(Point point) {

       for (int i=0; i<8; i++) {
           int nx = point.x + dx[i];
           int ny = point.y + dy[i];
           if (nx >=0 && nx < N && ny >=0 && ny < N && board[nx][ny] == 1){ // 유효 범위 + 섬이면
               board[nx][ny] = 0;  //
               DFS(new Point(nx,ny));
           }
       }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        board = new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                board[i][j] = in.nextInt();
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (board[i][j] == 1) { // 섬이라면
                    answer++;  // 섬의 갯수를 증가시킨다.
                    board[i][j] = 0;    // 첫 출발점도 0으로 바꾸기
                    DFS(new Point(i,j));
                }
            }
        }
        System.out.println(answer);
    }
}

package 인프런.DFSBFS활용.토마토BFS활용.두번째풀이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
*
* 두 번째 풀이
* - 토마토가 익지 못하는 상황: 익지 않은 토마토의 인접(상,하,좌,우)에 토마토가 없는 상황.
*
* 주의사항
* -M: 열의 길이 = 가로 칸의 갯수ㅡ
* -dis 배열은 걸리는 날짜를 저장한다.
* -시작하는 곳이 한 곳이 아니라 여러 곳이고 동시에 퍼져야 한다.  --> bfs 돌기 전에 미리 모두 큐에 넣는다.
* -처음부터 상자에 있는 토마토가 모두 익은 상태라면 dis[][] 최댓값은 0이다.
* -최소 날짜는 dis[][]에서 최댓값을 찾으면 된다.
* -만약 bfs()통과후 board[][]에 0이 남아있으면 -1을 출력한다.
* */

class Point {
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] board;
    static int[][] dis;
    static Queue<Point> q = new LinkedList<>();
    static int N,M;

    public static void BFS() {
        while (!q.isEmpty()) {
            Point temp = q.poll();
            for (int i=0; i<4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >=0 && nx < N && ny >=0 && ny <M && board[nx][ny] == 0) {
                    q.offer(new Point(nx, ny));
                    board[nx][ny] = 1;
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        board = new int[N][M];
        dis = new int[N][M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                board[i][j] = in.nextInt();
                if (board[i][j] ==1)
                    q.offer(new Point(i,j));
            }
        }
        BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (board[i][j] == 0)
                    flag = false;
            }
        }

        if (flag) {
            for (int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }
        else {
            System.out.println(-1);
        }
    }
}

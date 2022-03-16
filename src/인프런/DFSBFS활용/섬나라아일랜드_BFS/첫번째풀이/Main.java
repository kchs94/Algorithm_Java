package 인프런.DFSBFS활용.섬나라아일랜드_BFS.첫번째풀이;


import java.util.LinkedList;
import java.util.Queue;
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
    static int[] dx = {0,1,1,1,0,-1,-1,-1};
    static int[] dy = {-1,-1,0,1,1,1,0,-1};
    static int answer;
    static Queue<Point> q = new LinkedList<>();

    public static void BFS(Point point) {
        q.offer(point);

        while (!q.isEmpty()) {
            Point temp = q.poll();
            for (int i=0; i<8; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >=0 && nx<N && ny >=0 && ny <N && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    BFS(new Point(nx,ny));
                }
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
                if (board[i][j] == 1) {
                    answer++;
                    BFS(new Point(i,j));
                }
            }
        }

        System.out.println(answer);
    }
}

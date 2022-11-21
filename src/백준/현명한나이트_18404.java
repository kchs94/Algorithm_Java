package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*
*
* 최소와 관련되 있으므로 bfs로 접근할 수 있음
* 2차원 배열 + bfs 문제
* */
public class 현명한나이트_18404 {
    static int[][] map; // 체스판
    static int N;   // 체스판 크기
    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2}; // 방향
    static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
    static Queue<Point> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int start_x = Integer.parseInt(st.nextToken()); // 나이트 x 위치
        int start_y = Integer.parseInt(st.nextToken()); // 나이트 y 위치

        map = new int[N + 1][N + 1];
        bfs(start_x, start_y);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            sb.append(map[x][y]).append(" ");
        }

        System.out.println(sb);
    }

    public static void bfs(int x, int y) {
        q.add(new Point(x,y));

        while (!q.isEmpty()) {
            Point point = q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx > 0 && nx <= N && ny > 0 && ny <= N) {
                    if (map[nx][ny] == 0) {
                        map[nx][ny] = map[x][y] + 1;
                        q.add(new Point(nx,ny));
                    }
                }
            }
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
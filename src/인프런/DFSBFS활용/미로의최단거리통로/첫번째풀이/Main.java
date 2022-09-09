package 인프런.DFSBFS활용.미로의최단거리통로.첫번째풀이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
* 2차원 배열 + 최단거리
* 1.레벨 변수로 풀기
* 2.dis 배열로 풀기 - 선택
*
* */

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {

    static int[] dx = {0,0,-1,1};       // 상,하,좌,우
    static int[] dy = {-1,1,0,0};
    static int[][] map = new int[8][8];
    static int[][] dis = new int[8][8];
    static boolean[][] visited = new boolean[8][8];
    static Queue<Node> q = new LinkedList<>();

    public static void BFS(int x, int y) {
        visited[1][1] = true;
        dis[1][1] = 0;
        q.offer(new Node(x,y));

        while (!q.isEmpty()) {
            Node node = q.poll();

            for (int i=0; i<4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx == 7 && ny ==7) {
                    dis[nx][ny] = dis[node.x][node.y] + 1;
                    return;
                }

                if (nx >=1 && nx <=7 && ny >= 1 && ny <= 7 && map[nx][ny] == 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    dis[nx][ny] = dis[node.x][node.y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                map[i][j] = in.nextInt();
            }
        }

        // 알고리즘
        BFS(1,1);

        if (dis[7][7] == 0)
            System.out.println(-1);
        else {
            System.out.println(dis[7][7]);
        }
    }
}

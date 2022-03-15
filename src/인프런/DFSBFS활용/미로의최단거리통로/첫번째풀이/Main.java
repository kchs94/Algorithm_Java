package 인프런.DFSBFS활용.미로의최단거리통로.첫번째풀이;

import java.util.Scanner;
/*
* 왜 BFS인가?
* 
*
* */
public class Main {

    static int min = Integer.MAX_VALUE;
    static int count;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int[][] map = new int[8][8];


    public static void dfs(int x,int y) {
        if (count > min) return;

        if (x == 7 && y == 7) {
            min = Math.min(count, min);
        }
        else {
            for (int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >=1 && ny <=7 && map[nx][ny] == 0) {
                    count++;
                    map[nx][ny] = 1;
                    dfs(nx, ny);
                    map[nx][ny] = 0;
                    count--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i=1; i<8; i++) {
            for (int j=1; j<8; j++) {
                map[i][j] = in.nextInt();
            }
        }

        map[1][1] = 1;
        dfs(1,1);
        System.out.println(min);
    }
}

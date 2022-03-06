package 인프런.DFSBFS활용.미로탐색.첫번째풀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 7*7 격자 미로를 탈출할 수 있는 경우의 수를 구하세요.
*
* - 출발점 격자는 (1,1)좌표, 탈출 도착점은 (7,7).
* - 값 1은 벽, 값 0은 통로
* - 움직이는 것은 상,하,좌,우로만 가능하다.
*
* 입력으로는 7*7 격자판 정보가 입력된다.
* 출력으로는 탈출 할 수 있는 경우의 수의 합이 출력된다.
*
* 첫 번쨰 풀이 스택오버풀로우!
* 
* */
public class Main {

    static int[][] map = new int[8][8];
    static int[] dx = {0,0,-1,1};   // 상,하,좌,우
    static int[] dy = {-1,1,0,0};   // 상,하,좌,우
    static int[][] visited = new int[8][8]; // 같은 곳을 또 지나가면 안되니깐
    static int answer = 0;

    public static void dfs(int L, int x, int y) {

        if (x == 7 && y == 7) {
            answer++;
            return;
        }
        else {
            // 상
            if (y >=2 && map[x][y-1] == 0) {
                visited[x][y-1] = 1;
                dfs(L+1, x, y-1);
                visited[x][y-1] = 0;
            }

            // 하
            if (y <= 6 && map[x][y+1] == 0) {
                visited[x][y+1] = 1;
                dfs(L+1,x,y+1);
                visited[x][y+1] = 0;
            }
            // 좌
            if (x >= 2 && map[x-1][y] == 0) {
                visited[x-1][y] = 1;
                dfs(L+1, x-1, y);
                visited[x-1][y] = 0;
            }

            // 우
            if (x <= 6 && map[x+1][y] == 0) {
                visited[x+1][y] = 1;
                dfs(L+1,x+1, y);
                visited[x+1][y] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i=1; i<=7; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j=1; j<=7; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,1,1);

        System.out.println(answer);
    }
}

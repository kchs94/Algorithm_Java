package 인프런.DFSBFS활용.미로탐색.두번째풀이;

import java.io.IOException;
import java.util.Scanner;

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
* 두 번쨰 풀이
* dx, dy와 for문을 적절히 활용하기
* 다음 칸으로 갈 수 있는 조건을 잘 생각하기
* */
public class Main {

    static int[] dx = {0, 0, -1, 1};    // 상하좌우
    static int[] dy = {-1, 1, 0, 0};
    static int answer;  // 경우의 수
    static int[][] map = new int[8][8];

    public static void dfs(int x, int y) {  // 필요한 정보만 매개변수로 만들다.
        if (x == 7 && y == 7) {
            answer++;
        }
        else {
            for (int i=0; i<4; i++) {   // 상, 하, 좌, 우
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >=1 && nx <= 7 && ny >= 1 && ny <=7 && map[nx][ny] == 0) {   // 갈 수 있는 조건
                    map[nx][ny] = 1;    // 갔다고 체크하고
                    dfs(nx,ny); // 위치 옮기기
                    map[nx][ny] = 0;    // 뒤로 갔으면 체크 풀기
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        for (int i=1; i<8; i++) {
            for (int j=1; j<8; j++) {
                map[i][j] = in.nextInt();
            }
        }
        map[1][1] = 1;// (1.1) 방문 표시하기
        dfs(1, 1);  // 출발점
        System.out.println(answer);
    }
}

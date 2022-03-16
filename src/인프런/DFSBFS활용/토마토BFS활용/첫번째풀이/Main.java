package 인프런.DFSBFS활용.토마토BFS활용.첫번째풀이;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
* 창고 -> 2차원 배열
* 익은 토마토의 인접한 곳(상,하,좌우)에 있는 익지 않은 토마토들은 영향을 받아 익게 된다. --> dx, dy 배열 필요
* "현수는 창고에 보관된 토마토들이 며칠이 지나면 다 익게 되는지, 그 최소 일수를 알고 싶어 한다." --> BFS 문제
* 단, 상자 일부 칸에는 토마토가 들어 있지 않을 수도 있다.
*
* 입력
* - 첫 줄에 상자의 가로 길이 M 세로 길이 N이 주어진다. 2<=M,N<1000
* - 둘째 줄부터 각 칸에 들어가 있는 토마토 상태가 주어진다.
* - 1: 익은 토마토
* - 0: 익지 않은 토마토
* - -1: 토마토 없음
*
* 출력
* - 토마토가 모두 익을 때까지의 최소 날짜를 출력한다.
* - 만약 저장 될 때부터 모두 익어있는 상태면 0을 출력한다 = 입력을 받을 때 0이 없으면 곧바로 0을 출력한다.
* - 토마토가 모두 익지 못하는 상황이면 -1을 출력한다. = 탐색 종류 후 배열에 0이 남아있으면 -1을 출력한다.
*
*
* 알고리즘
* - 입력을 다 받는다.
* - 큐에 익은 토마토들을 넣는다.
* - 큐에 익은 토마토 숫자만큼 반복한다.
* - 큐에 익은 토마토를 꺼낸다.
* - 꺼낸 토마토 위치를 기준으로 상,하,좌,우 중 익지 않은 토마도가 있으면 익은 토마토로 바꾼다.
* - 그리고 그 토마토를 큐에 넣는다.
* - 반복
* - 만약 큐에 토마토가 없으면 함수를 종료한다.
*
* 첫 번째 풀이 후기
* - 행과 열 길이인지 가로 칸 갯수인지 잘 확인하자.
* */

class Node {
    int x,y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {

    static int M;   // 가로 칸 수
    static int N;   // 세로 칸 수
    static int[][] dis;
    static int[][] map;
    static boolean isThereUnripe;
    static Queue<Node> q = new LinkedList<>();
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1, -1};
    static int answer;

    public static void BFS() {
        int len = q.size();

        while(!q.isEmpty()) {
            for (int i=0; i<len; i++) {
                Node node = q.poll();

                for (int j=0; j<4; j++) {
                    int nx = node.x + dx[j];
                    int ny = node.y + dy[j];
                    if (nx >=0 && nx <M && ny >=0 && ny < N && map[nx][ny] == 0) {
                        map[nx][ny] = 1;
                        dis[nx][ny] = dis[node.x][node.y] +1;
                        answer = Math.max(answer, dis[nx][ny]);
                        q.offer(new Node(nx,ny));
                    }
                }
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (map[i][j] == 0) {
                    answer = -1;
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        dis = new int[N][M];
        map = new int[N][M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                map[i][j] = in.nextInt();
                if (map[i][j] == 0)
                    isThereUnripe = true;
                else if (map[i][j] == 1)
                    q.offer(new Node(i,j));
                    dis[i][j] = 0;
            }
        }
        if (!isThereUnripe) {
            answer = 0;
            System.out.println(answer);
            return;
        }

        BFS();
        System.out.println(answer);
    }
}

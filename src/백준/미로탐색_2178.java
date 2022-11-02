package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
* (1, 1)에서 출발하여 (N,M) 위치로 이동할 때 필요한 최소한의 칸 수를 구하세요.
*
* // 미로의 크기 N, M  입력받기
* // 2차원 배열을 이용해서 2차원 미로 입력받기
* // bfs(N,M) 호출하기
* // answer출력하기
*
* // 주의할점
* 1,1부터 시작 이니깐 배열의 크기 + 1하기
* x,y 두 값을 q에 넣기위해 Node 클래스를 생성함
* y값 상하 주의하기
* */
public class 미로탐색_2178 {
    static int[][] arr;
    static int N;
    static int M;
    static int[] dx = {0,0,-1,1}; // 상 하 좌 우
    static int[] dy = {-1,1,0,0}; // 상 하 좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][M+1];    // 좌표와 인덱스를 같도록 사용하기 위해

        for (int i=1; i<=N; i++) {  // 행 반복

            char[] chars = br.readLine().toCharArray();
            for (int j=1; j<=M; j++) {
                arr[i][j] = Character.getNumericValue(chars[j-1]);
            }
        }

        bfs(new Point(1,1));

        System.out.println(arr[N][M]);
    }

    public static void bfs(Point point) {
        Queue<Point> q = new LinkedList<>();
        q.add(point);

        while (!q.isEmpty()) {
            Point findPoint = q.poll();

            for (int i=0; i<4; i++) {
                int nx = findPoint.x + dx[i];
                int ny = findPoint.y + dy[i];
                if (nx >= 1 && nx <= M && ny >=1 && ny <=N && arr[ny][nx] == 1 ) {
                    arr[ny][nx] = arr[findPoint.y][findPoint.x] + 1;    //방문체크
                    q.add(new Point(nx,ny));
                }
            }
        }
    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

package 인프런.재귀와트리와그래프.송아지찾기.내풀이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] dis = {-1, 1, 5};                  // 이동할 수 있는 거리
    static boolean[] visited = new boolean[10001];  // 방문표시를 위한 배열 인덱스는 x좌표를 의미한다.
    static Queue<Integer> q = new LinkedList<>();   // 상태를 담을 큐 선언
    static int L = 0;   // 레벨

    public static void BFS(int S, int E) {
        visited[S] = true;  // 방문표시
        q.offer(S); // 방문

        while(!q.isEmpty()) {
            int len = q.size();

            for (int i=0; i<len; i++) {
                int x = q.poll();
                for (int dis : dis) {
                    int nx = x + dis;

                    if (nx == E) {
                        L++;
                        return;
                    }
                    if (nx >= 1 && nx < 10000 && !visited[nx]) {
                        visited[nx] = true;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();   // 수직선에서 현수의 위치
        int E = in.nextInt();   // 수직선에서 송아지의 위치
        BFS(S, E);
        System.out.println(L);
    }
}

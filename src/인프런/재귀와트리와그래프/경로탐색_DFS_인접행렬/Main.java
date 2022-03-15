package 인프런.재귀와트리와그래프.경로탐색_DFS_인접행렬;

import java.util.Scanner;

/*
* 경로탐색 - DFS 인접행렬로 문제 풀기
* 노드의 갯수만큼 for문이 반복한다.
*
*
* */
public class Main {

    static int n;   // 정점 수 (1<=n<=20)
    static int m;   // 간선 수
    static int[][] graph;   // 인접행렬
    static boolean[] visited;   // 체크배열
    static int answer;  // 총 가지 수

    public static void dfs(int node) {
        if (node == n) {    // n 노드라면
            answer++;
        } else {
            for (int i=1; i<=n; i++) {  // 노드 갯수만큼 1~n까지 반복
                if (graph[node][i] == 1 && !visited[i]) {  //현재 node에서 i로가는데,  i 노드와 연결되어 있고, 방문한 적이 없다면
                    visited[i] = true;  // i노드 방문 체크하기
                    dfs(i); // i 노드로 넘어가기
                    visited[i] = false;// 여기까지 온건 빽을 했다는 것 이니깐 i노드 방문 체크풀기
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();   // 정점 수 입력
        m = in.nextInt();   // 간선 수 입력
        graph = new int[n+1][n+1];  // 인덱스 = 노드번호
        visited = new boolean[n+1];
        for (int i=0; i<m; i++) {   // 간서 수만큼 반복
            int from = in.nextInt();    // 첫 번째 숫자는 출발노드
            int to = in.nextInt();      // 두 번째 숫자는 도착노드
            graph[from][to] = 1;    // 1:연결상태를 의미
        }

        visited[1] = true;  // 1노드를 방문하니깐
        dfs(1); // 1노드 방문하기
        System.out.println(answer);
    }
}

package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
* 데이터 크기: 2,000
* 제한시간: 2초
* 친구와 친구 관계는 마치 그래프의 정점과 간선같다는 느낌이 들었다.
* 양방향 그래프
* 문제에서 말하는 위와같은 관계는 5개의 노드가 DFS 방식으로 연결된 관계를 말한다.
* 노드의 갯수가 2천개이므로 그래프는 인접행렬보다 인접리스트를 이용하여 시간복잡도를 낮췄다.
* DFS 경로 탐색이므로 방문했던 곳을 다시 방문하면 안되므로 체크 배열이 필요하다.
* - 첫 줄에 사람 수 N 입력, 관계 수 M 입력받기
* - 전역변수: N, M , graph, checked, answer
* - 그래프 생성: 인접리스트
* - 체크배열 생성
* - 그래프 초기화: for M번 반복
* - DFS 알고리즘
* - for 0 ~ N-1: 모든 노드부터 시작해봐야 하니깐
* - dfs(i,0)
* - sout(answer)
* - dfs (int node, int depth)알고리즘
* - 만약 깊이가 4라면(depth == 4)
* -     answer = 1;
* -     break
* - 그 외라면
* - for 인접한 노드 갯수
* -     만약 아직 찾지 못했고(answer = false), 방문하지 않았다면(인접리스트라 갈 수 있는 곳만 남겨있음)
* -         체크 하기
* -         dfs(v, int depth + 1)
* -         체크 풀기
* */
public class ABCDE_025 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] checked;
    static int answer;

    public static void dfs(int node, int depth) {
        if (depth == 4 || answer == 1) {
            answer = 1;
            return;
        }
        else {
            for (Integer v : graph.get(node)) {
                if (!checked[v]) {
                    checked[v] = true;
                    dfs(v, depth+1);
                    checked[v] = false;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i=0; i<N; i++) {
            graph.add(new ArrayList<>());
        }
        checked = new boolean[N];
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            graph.get(S).add(E);
            graph.get(E).add(S);
        }
        for (int i=0; i<N; i++) {
            checked[i] = true;
            dfs(i,0);
            checked[i] = false;
        }

        System.out.println(answer);
    }
}

package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * https://www.acmicpc.net/problem/11724
 * - 데이터크기: 1,000
 * - 제한시간: 3초
 * 방향 없는 그래프 + DFS 문제. 노드의 갯수가 최대 1,000개이므로 인접행렬보다는 인접리스트를 사용하는게 좋다.
 *
 *
 * */
public class 연결요소의갯수_023 {

    static int n;
    static int e;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] checked;
    static int answer = 0;

    public static void dfs(int node) {
        for (Integer v : graph.get(node)) {
            if (!checked[v]) {
                checked[v] = true;
                dfs(v);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        checked = new boolean[n + 1];

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        for (int i = 1; i <= n; i++) {
            if (!checked[i]) {
                answer++;
                dfs(i);
            }
        }
        System.out.println(answer);
    }
}

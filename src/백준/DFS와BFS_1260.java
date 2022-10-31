package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
*
*
* */
public class DFS와BFS_1260 {

    static boolean[] check;
    static ArrayList<Integer>[] graph;
    static int N;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        check = new boolean[N+1];
        graph = new ArrayList[N+1];
        int M = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());
        for (int i=1; i<=N; i++) {  // 초기화
            graph[i] = new ArrayList<>();
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            graph[n1].add(n2);
            graph[n2].add(n1);
        }

        for (int i=1; i<=N; i++) {  // 정렬
            Collections.sort(graph[i]);
        }

        check[startNode] = true;
        dfs(startNode, 0);
        System.out.println(sb.toString());

        Arrays.fill(check, false);
        check[startNode] = true;
        bfs(startNode);

    }

    public static void bfs(int node) {
        sb = new StringBuilder();
        sb.append(node).append(" ");
        Queue<Integer> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            Integer findNode = q.poll();
            for (Integer next : graph[findNode]) {
                if (!check[next]) {
                    sb.append(next + " ");
                    check[next] = true;
                    q.add(next);
                }
            }
        }
        System.out.println(sb.toString());
    }

    public static void dfs(int node, int L) {
        sb.append(node + " ");
        if (L == N-1) {
            return;
        } else {
            for (Integer next : graph[node]) {
                if (!check[next]) {
                    check[next] = true;
                    dfs(next, L+1);
                }
            }
        }
    }
}

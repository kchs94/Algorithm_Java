package 인프런.재귀와트리와그래프.그래프최단거리_BFS.내풀이;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
* 그래프 + 최단거리(BFS)
*
* */
public class Main {

    static int n, m;
    static int[] dis;   // 최단 거리를 담을 배열
    static boolean[] visited;   // 방문 표시 배열
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 그래프 문제니깐
    static Queue<Integer> q = new LinkedList<>();   // 노드를 담을 큐

    public static void BFS(int v) {
        visited[v] = true;
        dis[v] = 0;
        q.offer(v);
        while(!q.isEmpty()) {
            int cv = q.poll();
            for (int nv : graph.get(cv)) {
                if (!visited[nv]) {
                    visited[nv] = true;
                    dis[nv] = dis[cv] + 1;
                    q.offer(nv);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();   // 정점 수
        m = in.nextInt();   // 간선 수
        for (int i=0; i<=n; i++) {  // 정점 갯수 + 1
            graph.add(new ArrayList<>());
        }
        dis = new int[n+1];
        visited = new boolean[n+1];
        for (int i=0; i<m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
        for (int i=2; i<=n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}

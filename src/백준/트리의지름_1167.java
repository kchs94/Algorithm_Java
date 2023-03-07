package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
* 트리의 지름 = 두 점 사이의 거리 중 가장 긴 것
*
* */
public class 트리의지름_1167 {

    static ArrayList<Node>[] graph;
    static int[] distance;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        graph = new ArrayList[V+1];

        // 그래프 선언
        for (int i=1; i<=V; i++) {
            graph[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i=0; i<V; i++ ){   // 그래프 초기화
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            while (true) {
                int n2 = Integer.parseInt(st.nextToken());
                if (n2 == -1)
                    break;
                int distance = Integer.parseInt(st.nextToken());
                graph[n1].add(new Node(n2, distance));
            }
        }

        distance = new int[V+1];
        check = new boolean[V+1];
        int max = 1;
        bfs(1);
        for (int i=2; i<=V; i++) {
            if (distance[max] < distance[i])
                max = i;
        }

        Arrays.fill(distance, 0);
        Arrays.fill(check, false);
        bfs(max);
        Arrays.sort(distance);
        System.out.println(distance[V]);


    }

    public static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        check[node] = true;
        while (!q.isEmpty()) {
            int findNode = q.poll();
            for (Node nextNode : graph[findNode]) {
                int value = nextNode.value;
                int dis = nextNode.distance;
                if (!check[value]) {
                    check[value] = true;
                    q.add(value);
                    distance[value] = distance[findNode] + dis;
                }
            }
        }

    }

    static class Node {
        int value;
        int distance;

        public Node(int value, int distance) {
            this.value = value;
            this.distance = distance;
        }
    }
}

package 프로그래머스.레벨3;

public class 네트워크 {
    static boolean[] check;
    static int[][] graph;
    static int answer = 0;

    public int solution(int n, int[][] computers) {
        check = new boolean[n];
        graph = computers;

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(i);
                answer++;
            }
        }

        return answer;
    }

    public static void dfs(int node) {
        for (int i = 0; i < graph.length; i++) {
            if (i != node && !check[i] && graph[node][i] == 1) {
                check[i] = true;
                dfs(i);
            }
        }
    }
}

package 인프런.재귀와트리와그래프.경로탐색_DFS_인접리스트;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 그래프를 인접리스트로 표현하기
*
* 문제
* 방향 그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
* 입력
* 정점의 수: 1<=N<=20
* 간선의 수: M
* 첫 번째 줄에 공백으로 분리해서 정점의 수와 간선의 수가 입력됩니다.
* 두 번째 줄부터 M줄에 걸쳐 연결 정보가 주어집니다.
*
* 정점이 많을 경우(100개 이상)에 인접행렬 dfs로 풀면 메모리 낭비와 시간복잡도가 높아진다.
* 정점이 만개일 경우 행과열의 길이가 각각 10000이나 된다!
* 따라서 인접리스트로 그래프 문제를 풀어야 한다.
*
*
* */
public class Main {
    static int n;   // 정점 수
    static int m;   // 간선 수
    static ArrayList<ArrayList<Integer>> graph; // 그래프
    static boolean[] visited;   // 체크배열. 방문한 노드를 또 방문하면 무한반복이 일어나기 때문에 체크해야한다.
    static int answer;  // 정답

    public static void dfs(int v) {
        if (v == n)    // v노드가 n노드이면
            answer++;
        else {
            // 인접리스트에서 ArrayList를 탐색할 때는 for-each문이 좋다.
            for (int nv : graph.get(v)) {   // v번 ArrayList, v번 노드에서 갈 수 있는 노드 번호들이 Integer 담겨있다.
                if (!visited[nv]) { // 방문한 적이 없다면
                    visited[nv] = true;
                    dfs(nv);
                    visited[nv] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();   // 정점 갯수 입력받기
        m = in.nextInt();   // 간선 갯수 입력받기
        graph = new ArrayList<>();  // 인접리스트 만들기
        for (int i=0; i<=n; i++) {  // 1부터 접근할 것이지만 0번 생성을 피할 수 없으니깐 n+1개의 리스트 객체를 생성한다.
            graph.add(new ArrayList<>());
        }
        visited = new boolean[n+1]; // 인덱스는 노드 번호이므로 정점 갯수 + 1만큼 체크배열 길이를 선언한다.
        for (int i=0; i<m; i++) {   // 간선의 갯수만큼 반복합니다.
            int a = in.nextInt();   // 출발 노드번호
            int b = in.nextInt();   // 도착 노드번호
            graph.get(a).add(b);    // get으로 출발노드를 선택하고 도착 노드번호를 담는다.
        }

        visited[1] = true;  // 1번 노드부터 출발하니깐 먼저 체크배열에 체크하기
        dfs(1); // 1번 노드 방문하기
        System.out.println(answer);
    }
}

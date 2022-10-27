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
 * */
public class 연결요소의갯수_023 {


    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    static boolean[] checked;   // 체크 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 노드 갯수
        int M = Integer.parseInt(st.nextToken());   // 엣지 갯수
        checked = new boolean[N+1]; // 체크 배열 사이즈 결정

        // 노드 갯수만큼 반복
        for (int i=0; i<=N; i++) {
            list.add(new ArrayList<>());
        }

        // 인접리스트 셋팅
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            list.get(node1).add(node2);
            list.get(node2).add(node1);
        }

        int count = 0;
        for (int i=1; i<=N; i++) {
            if (!checked[i]) {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

    public static void dfs(int v) {
        if (checked[v]) {
            return ;
        }
        else {
            checked[v] = true;
            for (Integer node : list.get(v)) {
                if (!checked[node]) {
                    dfs(node);
                }
            }
        }
    }
}

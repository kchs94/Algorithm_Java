package 백준.백트래킹.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문제_15649 {

    public static int N;    // 정적 변수
    public static int M;    // 정적 변수
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정적 변수 N과 M 초기화
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N+1];

        // 정적 변수를 쓰기 때문에 굳이 N과 M을 전달할 필요가 없어진다.
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth == M) {
            for(int value : arr) {
                sb.append(value).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=1; i<=N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}

package 백준.단계별문제풀이.백트래킹.N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문제_15649 {

    public static int N;    // 1~N까지 의 수
    public static int M;    // M개를 선택해서 나열하는 모든 경우의 수
    public static int[] arr;    // 결과 값을 담을 배열
    public static boolean[] visit;  // 노드의 유망성 판단.
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
            if(!visit[i]) { // i값을 사용하지 않았으면
                visit[i] = true;    // i값을 사용한 것으로 처리
                arr[depth] = i;     // 결과값 배열에 i값 넣기
                dfs(depth + 1); // 다음 깊이의 노드 유망성 판단.
                visit[i] = false;
            }
        }
    }
}

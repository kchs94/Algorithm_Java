package 백준.단계별문제풀이.백트래킹.N과M_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문제_15651 {

    static int N;
    static int M;
    static int[] arr;
    static boolean[] used;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        used = new boolean[N+1];

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth == M){
            for(int value : arr){
                sb.append(value).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=1; i<=N; i++) {
            used[i] = true;
            arr[depth] = i;
            dfs(depth + 1);
            used[i] = false;
        }
    }
}

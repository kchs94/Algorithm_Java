package 백준.백트래킹.N과M_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문제_15650 {
    static int[] arr;
    static boolean[] used;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        used = new boolean[N+1];

        dfs(1, 0);
        System.out.println(sb);
    }

    public static void dfs(int at, int depth) {

        if(depth == M) {
            for(int value : arr){
                sb.append(value).append(' ');
            }
            sb.append('\n');
            return ;
        }

        for(int i=at; i<=N; i++) {
            if(!used[i]){
                used[i] = true;
                arr[depth] = i;
                dfs(i+1, depth + 1);
                used[i] = false;
            }
        }
    }
}

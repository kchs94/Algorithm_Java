package 백준.백트래킹.N과M_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 문제 읽기 --> 수도코드 --> 코딩 --> 테스트 케이스
* 중복순열 + 비내림차순(=오름차순인데 1 1 3과 같은 케이스도 허용)
*
* 수도코드
* 1.N과 M을 입력받는다.
* 2.1~N까지의 값을 중복을 허용해서 M개를 뽑는다.
* 3.대신 등호를 포함하는 오름차순으로 뽑는다.
* 4.모든 경우의 수를 출력한다.
* */
public class 문제_15652 {

    static int N;
    static int M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(1, 0);
        System.out.println(sb);
    }

    public static void dfs(int at, int depth) {
        if(depth == M){
            for(int value : arr){
                sb.append(value).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = at; i<=N; i++){
                arr[depth] = i;
                dfs(i, depth + 1);
        }
    }
}

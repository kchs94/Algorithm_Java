package 백준.for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다작은수_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //문자열 입력 단위를 행이 아닌 공백을 기준으로 하기 위해

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        br.close();

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
            if(arr[i] < X)
                System.out.print(arr[i] + " ");
        }
    }
}

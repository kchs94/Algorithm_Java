package 백준.동적계획법.신나는함수실행;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문제_9184 {

    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[3];
        StringBuilder sb = new StringBuilder();

        while(true) {
            st = new StringTokenizer(br.readLine());

            for(int i=0 ; i<3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if(arr[0] == -1 && arr[1] == -1 && arr[2] == -1)
                break;
            sb.append("w(" + arr[0] + ", " + arr[1] + ", " + arr[2] + ") = ");
            sb.append(w(arr[0], arr[1], arr[2]) + "\n");        // "\n"과 '\n'의 차이가 멀까? (o)
        }

        System.out.println(sb);
    }

    public static int w(int a, int b, int c) {

        if(inRange(a, b, c) && dp[a][b][c] != 0)
            return dp[a][b][c];

        if(a <=0 || b <= 0 || c <= 0)
            return 1;
        else if (20 < a || 20 < b || 20 < c)
            return dp[20][20][20] = w(20, 20, 20);
        else if (a < b && b < c)
            return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        else
            return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) +
                    w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }

    static boolean inRange(int a, int b, int c) {
        return 0<= a && a <=20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }
}

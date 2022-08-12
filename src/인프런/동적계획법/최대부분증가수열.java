package 인프런.동적계획법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대부분증가수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 1;

        int[] dp = new int[arr.length];
        dp[0] = 1;

        for (int i=1; i<arr.length; i++) {
            int max = 0;
            for (int j=0; j<i; j++) {
                if (arr[j] < arr[i] && dp[j] > max) max = dp[j];
            }
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}

package 백준.동적계획법.일로만들기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 문제_1463 {

    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N+1];  // 각 숫자마다 연산 횟수의 최솟값을 저장할 배열
        dp[1] = 0;  // 숫자 1은 연산 횟수가 0니 0 대입 그리고 입력값은 1이상이므로 미리 대입해도 상관 없다.

        System.out.println(find(N));
    }

    static int find(int N) {

        if(dp[N] == null){
            if(N%6 == 0){
                dp[N] =  Math.min(find(N-1), Math.min(find(N/3), find(N/2))) + 1;
            } else if(N%3 == 0){
                dp[N] = Math.min(find(N/3), find(N-1)) + 1;
            } else if(N%2 == 0){
                dp[N] = Math.min(find(N/2), find(N-1)) + 1;
            } else {
                dp[N] = find(N-1) + 1;
            }
        }

        return dp[N];
    }
}

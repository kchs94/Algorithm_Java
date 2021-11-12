package 백준.동적계획법;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 문제_2748 {
    
    static long[] dp; // 동적 프로그래밍에서 값을 저장하기위해(메모이제이션) 배열 선언

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new long[n+1];  // 크기는 구하는 순서까지만 할당.

        for(int i=2; i<n+1; i++) {
            dp[i] = -1; // 값 -1은 사용하지 않았다는 의미
        }

        dp[0] = 0;  // 피보나치 초기값 설정
        dp[1] = 1;

        System.out.println(fibo(n));
    }

    public static long fibo(int N ) {

        if(dp[N] != -1)   // 값을 저장한 적이 있다면
            return dp[N];

        return dp[N] = fibo(N-1)  + fibo(N-2);  // 없다면
    }
}

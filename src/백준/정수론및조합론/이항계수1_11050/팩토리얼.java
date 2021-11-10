package 백준.정수론및조합론.이항계수1_11050;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* 조합 nCr = n!/(n-r)!*r! 이므로 팩토리얼로 풀기
* 
* */
public class 팩토리얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(factorial(N)/(factorial(N-K)*factorial(K)));
    }

    public static int factorial(int n) {
        if(n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }
}

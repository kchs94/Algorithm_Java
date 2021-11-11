package 백준.정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
* 최대공약수 --> 유클리드 호제법
* 최소공배수 = A*B / 최대 공약수
*
* */

public class 최소공배수_1934 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int A;
        int B;
        int gcd;
        int lcm;

        for(int i=0; i<T; i++) {

            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if(A < B) {
                int temp = A;
                A = B;
                B = temp;
            }

            gcd = getGCD(A, B);
            lcm = (A*B) / gcd;

            sb.append(lcm).append('\n');
        }

        System.out.println(sb);
    }

    public static int getGCD(int A, int B) {
        if(B == 0)
            return A;

        return getGCD(B, A%B);
    }
}

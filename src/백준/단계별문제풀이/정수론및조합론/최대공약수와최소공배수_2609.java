package 백준.단계별문제풀이.정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
*   최대공약수는 유클리드 호제법 공식으로 구한다
*   최소공배수 = (A/B) / 최대 공약수
*
* */
public class 최대공약수와최소공배수_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A < B){  // B가 크면 값을 바꿔줌
            int temp = A;
            A = B;
            B = temp;
        }

        int gcd = getGCD(A, B);
        int lcm = A*B / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int getGCD(int A, int B) {
        if(B == 0)
            return A;
        else
            return getGCD(B, A%B);
    }
}

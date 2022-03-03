package 백준.단계별문제풀이.정수론및조합론.이항계수1_11050;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* 순열 nPr: 서로다른 n개에서 r개를 1.선택하여 순서있게 일렬로 2.나열하는 모든 경우의 수
* 조합 nCr: 서로다른 n개에서 r개를 1.선택하는 모든 경우의 수
* 이항계수: 순열이 아닌 조합 개념
* N과 K의 범위가 작으니 재귀적으로 푼다.
* */

public class 조합으로풀기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(combination(N, K));
    }

    public static int combination(int n, int r) {

        if(n == r || r == 0) {
            return 1;
        }
        else {
            return combination(n-1, r) + combination(n-1, r-1);
        }
    }
}

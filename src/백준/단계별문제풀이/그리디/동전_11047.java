package 백준.단계별문제풀이.그리디;

import java.io.*;
import java.util.*;

public class 동전_11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());    // 형변환
        int K = Integer.parseInt(st.nextToken());    // 목표 값

        int[] money = new int[N];   // 금액 종류
        int answer = 0; // 정답

        // 값 입력
        for(int i=0; i<N; i++){
            money[i] = Integer.parseInt(br.readLine());
        }

        // 알고리즘
        for(int i=1; i<=N; i++){
            if(K/money[N-i] != 0){  // 몫이 있다면
                answer += K/money[N-i]; // 동전 갯수 추가
                K = K%money[N-i];   // 잔돈
            }
        }

        // 출력
        System.out.print(answer);
    }
}

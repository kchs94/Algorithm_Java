package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
*
* // 동전 갯수 N, 가치의합 K입력
* // N번 반복해서 각 동전별 가격 입력받기
* // K원을 만드는데 필요한 동전의 최솟값 연산
* // 최솟값 출력
* */
public class 기타레슨_2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        for (int i=N-1; i>=0; i--) {
            if (arr[i] <= K) {
                answer += (K / arr[i]); // 동전 수 += 목표금액 / 현재 동전 가치
                K = K % arr[i];         // 목표 금액 = 목표 금액 % 현재 동전 가치
            }
        }
        System.out.println(answer);
    }
}

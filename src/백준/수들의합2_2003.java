package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* N개의 수열이 있음 a1, a2, a3, ..., an
* 이 수열에서 i번째 수부터 j번째 수까지의 합이 M이 되는 모든 경우의 수를 출력하는 프로그램을 작성해라
* 제한 시간: 0.5초 (심상치 않다)
* 데이터 크기: N은 최대 30,000 Ai는 최대 30,000 M은 최대 3억
*
* 런타임
* 뭔가 푸는 방법은 아는데 명확하게 알지 못하는 느낌 이걸 해결하려면 구체적으로 어떤식으로 동작하는지 그려가면서 문제를 풀어야 할것 같다.
* 투포인터 + 부분합도 이용해야되나?
*
* */
public class 수들의합2_2003 {
    public static void main(String[] args) throws IOException    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int s = 0;
        int e = 0;
        long partialSum = 0;
        int answer = 0;
        while(e<=N) {
            if (partialSum > M) {
                
            }

        }
    }
}

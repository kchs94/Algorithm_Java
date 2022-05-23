package 백준.문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 투포인터 알고리즘을 이용하는 문제
* 인덱스 역할을 하는 두 개의 변수 s,e를 이용한다.
*
* 수의 갯수 N을 입력받고 연속된 부분 구간 합 M을 입력받는다.
* 길이가 N인 배열을 만든다.
* 둘째 줄에 N개의 수를 입력받는다.
* N번 반복한다.
*   입력받은 값을 배열에 할당한다.
* 인덱스 역할을 하는 start, end 변수를 0으로 초기화한다.
*
* 구간의 갯수를 담을 변수(answer)을 0으로 초기화한다.
* 구간의 합을 담을 변수(sum)을 0으로 초기화한다.
* sum에 인덱스가 end인 값을 먼저 넣는다.
* start가 end보다 커질 때까지 계속 반복한다.
*   만약 sum이 M으로 나누어 떨어진다면 answer++을 해주고 end++해주고, 그 값을 sum에 넣는다.
*   만약 sum이 M으로 나누어 떨이지지 않는다면 end++을 해주고 그 값을 sum에 더한다.
*   만약 e가 마지막 인덱스라면 s++해주고 e에 s값을 넣어준다.
*   만약 s가 마지막 인덱스라면 종료한다.
* 구간의 갯수를 출력한다.
* */
public class 나머지합_10986 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
    int M = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine(), " ");
    for (int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int start = 0;
    int end = 0;
    int answer = 0;
    int sum = arr[0];
    while(start <= N) {
      if (sum%M == 0) {
        answer++;
      }
      if (start == N - 1){
        if (sum%M == 0) answer++;
        else break;
      }
      if (end == N - 1) {
        sum -= arr[start++];
        end = start;
      }
      else sum += arr[++end];
    }
    System.out.println(answer);
  }
}

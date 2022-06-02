package Doit알고리즘.챕터1_배열과리스트.구간합구하기5_11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* 배열의 구간 합을 구해야 될때에는 합 배열을 이용하면 시간복잡도를 O(n)에서 On(1)로 줄일 수 있다.
* 합 배열 공식:S[i] = S[i-1] + arr[i]
* [i,j] 구간 합 공식: S[j] - S[i-1]
* 배열의 사이즈를 1 추가하여 인덱스가 1이 첫 번째 원소로 설정해야 합배열 첫 번째 원소도 규칙있게 구할 수 있다.
*
* 이번 문제에서 만약 합 배열을 이용하지 않고 이중 for문을 사용하면 수의 갯수*횟수이 연산횟수가 된다.
* 100,000*100,000 = 10,000,000,000 이다. 즉 100억번 연산을 하게되고 시간은 100초가 소요될것이다.
* 따라서 합배열을 사용해야하는 문제다.
*
* // 수의 갯수 N과 합을 구해야 하는 횟수 N을 입력받는다. 입력을 여러번 받으니 BufferedReader를 사용한다.
* // 수의 갯수만큼의 길이를 가지는 배열을 생성하고 값을 할당한다.
* // 수의 갯수만큼의 길이를 가지는 합배열을 생성하고 값을 할당한다.
* // 합배열을 이용해서 각 구간의 합을 구한다.
* */
public class Main {
  public static void main(String[] args) throws IOException {
    // 수의 갯수 N과 합을 구해야 하는 횟수 N을 입력받는다. 입력을 여러번 받으니 BufferedReader를 사용한다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    // 수의 갯수만큼의 길이를 가지는 배열을 생성하고 값을 할당한다.
    int[] arr = new int[N+1];
    st = new StringTokenizer(br.readLine()," ");
    for (int i=1; i<=N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    // 수의 갯수만큼의 길이를 가지는 합배열을 생성하고 값을 할당한다.
    int[] sumArr = new int[N+1];
    for (int i=1; i<=N; i++) {
      sumArr[i] = sumArr[i-1] + arr[i];
    }

    // 합배열을 이용해서 각 구간의 합을 구한다.
    int from=0, to=0;
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<M; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      from = Integer.parseInt(st.nextToken());
      to = Integer.parseInt(st.nextToken());
      sb.append(sumArr[to] - sumArr[from-1]).append("\n");
    }
    System.out.print(sb);
  }
}

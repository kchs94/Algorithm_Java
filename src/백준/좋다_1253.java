package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* 미해결 문제
* 두 개의 숫자를 선택하고 좋은 수까지 선택하고 비교해야되니 3중 for문으로 문제를 접근할 수도 있지만
* 데이터 크기가 2000이고 결국 20억이되어 최악의 경우 20초가 걸리므로 시간초과가 날 것이다.
* 따라서 데이터를 정렬(O(nlogn))하고 투포인터 알고리즘(O(n))을 사용해서 시간복잡도를 O(n^3)에서 최종적으로 O(n^2logn)로 낮출 수 있다.
*
* 수의 갯수 N을 입력받습니다.
* 길이가 N인 배열을 생성합니다.
* 두 번째 줄에 N개의 값을 입력받습니다.
* 입력받은 값을 배열에 할당합니다.
* 배열을 정렬합니다.
*
* start = 0, end = N-1 투포인터를 생성합니다.
* count = 0;
* 좋은 값을 N번 반복합니다.
*   while(start < end) {
*     if(A[start] + A[end] > 좋은 수) end--;
*     else if (A[start] + A[end] < 좋은수) start++;
*     else if (A[start] + A[end] == 좋은수) count ++; start++, end--;
* count를 출력합니다.
* */
public class 좋다_1253 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    long[] A = new long[N];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i=0; i<N; i++){
      A[i] = Long.parseLong(st.nextToken());
    }
    Arrays.sort(A);

    int count = 0;
    for (int k=0; k<N; k++) {
      long find = A[k];
      int start = 0, end = N-1;
      while(start<end) {
        if (A[start] + A[end] > find) end--;
        else if (A[start] + A[end] < find) start++;
        else if (A[start] + A[end] == find) {
          // find는 서로 다른 두 수의 합이여야 한다!
          if (start != find && end != find) {
            count++;
            break;
          }
          else if (start == find) start++;
          else if (end == find) end--;
        }
      }
    }
    System.out.println(count);
    br.close();
  }
}

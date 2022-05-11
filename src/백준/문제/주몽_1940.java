package 백준.문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* 문제 유형: 투포인터 알고리즘
* 정렬 후 투포인터 알고리즘 사용하기
*
* 재료의 갯수 N을 입력받는다.
* 길이가 N인 배열을 생성한다.
* 갑올을 만드는데 필요한 수 M을 입력받는다.
* 재료의 고유한 값을 입력받는다.
* N번 반복해서 재료들의 고유한 값을 배열에 할당한다.
* 재료들을 오름차순으로 정렬한다.
* 투포인터 역할을 하는 start, end 인덱스를 0과 배열의 길이-1로 초기화한다.
* 갑옷을 만들 수 있는 갯수를 저장할 변수(count)를 0으로 초기화한다.
* start < end가 참일 때까지 반복한다.
*   if (sum > M)
*     end--;
*   else if (sum <M) sum+= arr[++end];
*     start++
*   else if (sum == M)
*     count++
*     start++
*     end--;
* count를 출력한다.
* */
public class 주몽_1940 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr); // 입력 최댓값이 15000이고  정렬 알고리즘의 시간복잡도는 O(nlogn)이므로 사용가능

    int start = 0, end = N-1;
    int count = 0;
    while (start < end) {
      if (arr[start] + arr[end] > M) {
        end--;
      }
      else if (arr[start] + arr[end] <M) {
        start++;
      }
      else if (arr[start] + arr[end] == M) {
        count++;
        start++;
        end--;
      }
    }
    System.out.println(count);
    br.close();
  }
}

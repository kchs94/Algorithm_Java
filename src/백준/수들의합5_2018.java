package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* N을 입력받으면 연속된 자연수의 합으로 N을 표현할 수 있는 가지 수 출력하기
* 큰 데이터에서 연속된 수를 합해야 하니 시간복잡도가 O(n)인 투포인터 알고리즘을 사용합니다.
* 투 포인터 이동원칙
* 1.sum > N: sum -= arr[start++];
* 2.sum < N: sum += arr[++end];
* 3.sum == N: count++; sum += arr[++end];
* 반복은 end가 N이 아닐 때까지 계속 반복한다.
*
* 자연수 N을 입력받습니다.
* 인덱스 역할을 하는 start,end 변수를 1으로 초기화합니다.
* sum도 1로 초기화합니다.
* end가 N+1이 아니라면 계속 반복합니다.
*   만약 sum이 N보다 크다면 sum -= start++;
*   그밖에 만약 sum이 N보다 작다면 sum += ++end;
*   그밖에 만약 sum이 N이라면 answer++, sum += ++end;
* answer를 출력합니다.
* */
public class 수들의합5_2018 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int start =1, end = 1;
    int sum = 1;
    int answer = 0;

    while(end != N+1) {
      if (sum > N) sum -= start++;
      else if (sum < N) sum += ++end;
      else if (sum == N) {
        answer++;
        sum += ++end;
      }
    }
    System.out.println(answer);
  }
}

package 백준.문제;

import java.util.Scanner;

/*
* 구간 합 문제는 합 배열을 미리 만든 후 푼다.
* S[i] = S[i-1] + A[i]
*
* 수의 갯수 N과 합을 구해야 하는 횟수 M을 입력받는다.
* 길이가 N+1인 합 배열 sumArr를 선언한다.
* N만큼 반복한다.
*   N개의 수를 입력받는다.
*   합 배열에 값을 할당한다.
* M번 반복한다.
*   M개의 줄에서 합을 구해야할 구간 i와 j를 입력받는다.
*   sumArr[j] - sumArr[i-]을 출력한다.
* */
public class 구간합구하기_11659 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    int[] sum = new int[N+1];

    for (int i=1; i<=N; i++) {
      sum[i] = sum[i-1] + in.nextInt();
    }

    for (int k=0; k<M; k++) {
      int i = in.nextInt();
      int j = in.nextInt();
      System.out.println(sum[j] - sum[i-1]);
    }
  }
}

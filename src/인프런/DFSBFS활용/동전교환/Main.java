package 인프런.DFSBFS활용.동전교환;

import java.util.*;

/*
* 동전의 종류 갯수: 1<=N<=12
* 거슬러 줄 금액: 1<=M<=500
* 각 동전의 종류는 100원을 넘지 않는다.
*
* 문제
* 여러 가격이 다른 여러 동전들이 주어질 때 가장 적은 동으로 교환하려면 어떻게 주면될까?
* 거슬러 줄 동전의 최소개수
*
* 첫 번째 풀이시도
* 실패
* 단순히 값이 큰 동전으로 몫과 나머지를 계산하면 예외사항이 발생한다.
* 5
* 1 8 20 25 50
* 129
* 의 경우 큰 값으로 계산을하면 결과가 7이 나온다. 하지만 50,50,20,8,1처럼 5개의 동전이 답이 될 수도 있다.
*
* 두 번째 풀이시도
* DFS 중복순열 관점으로 풀기 + 배열을 내림차순으로 바꾸고 빠르게 정답 찾기
* 5 5 5
* 시간초과 --> 가격이 높은 동전부터 접근하기 위해 배열을 내렴차순으로 변경
*
*
* */
public class Main {

    static int n;   // 종류 갯수
    static Integer[] arr;
    static int m;   // 거슬러 줄 금액
    static int sum=0;
    static int answer = Integer.MAX_VALUE;

    // DFS 깊이 우선 탐색
    public static void dfs(int L) {
        if (sum > m) return;    // 값이 딱 떨어져야 하므로 넘으면 재귀를 종료한다.
        if (L > answer) return; // 최소로 구한 갯수보다 더 많은 갯수를 구한다면 정답이 될 수 없으므로 종료한다.

        if (sum == m) {
            answer = Math.min(answer, L);   // 여러 답 중 최솟값을 구한다.
        }
        else {
            for (int i=0; i<n; i++) {   // 동전 종류의 갯수만큼 가지를 뻗어나간다.
                sum += arr[i];
                dfs(L+1);
                sum -= arr[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new Integer[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        //Collections.reverseOrder()는 객체타입만 가능하다. 기본 타입은 불가능하다.
        Arrays.sort(arr, Collections.reverseOrder());   // 내림차순으로 변경
        m = in.nextInt();

        dfs(0);

        System.out.println(answer);
    }
}

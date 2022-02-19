package 인프런.DFSBFS활용.바둑이승차;

import java.util.Scanner;
/*
* DFS로 풀어야하는 이유
* - 부분집합과 관련이 있다.
* - 각 바둑이마다 태운다/태우지않는다 2가지 경우로 나눌 수 있다.
* - 내가 만드는 부분집합이 트럭에 타는 바둑이의 집합
* - DFS(L, SUM) 여기서 sum:트럭에 타는 바둑이의 무게(=부분집합의 합)
* - 제약조건: sum > c일 때 재귀를 return 빠져나온다.
*
* DFS는
* if-else 재귀로 푼다.
* */
public class Main {

    static int answer = Integer.MIN_VALUE;  // 최대 무게를 찾아야 하니깐
    static int c;   // 트럭의 허용가능 킬로그램
    static int n;   // 바둑이의 수

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;

        if (L == n) {
            answer=Math.max(answer, sum);   // 여러개가 있겠지만 기존 answer보다 크면 값을 바꾼다.
        }
        else {
            DFS(L+1, sum+arr[L], arr);     // L번째 바둑이를 포함한다
            DFS(L+1, sum, arr);                 // 포함하지 않는다.
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        c = in.nextInt();   // 무게
        n = in.nextInt();   // 바둑이 수
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}

package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/17298
* 다시 풀어보기
* 1.분석
* - 데이터 크기: 1,000,000
* - 제한시간: 1초
* - Ai의 오큰수: Ai 오른쪽에 있고, A보다 크고 가장 가까운 요소. 그러한 요소가 없으면 오큰수 값은 -1
* - 완전 탐색의 경우 시간복잡도는 O(N^2)이고 데이터 크기가 1,000,000이므로 시간 초과가 난다.
* - 어떤 포인트에서 스택을 사용해야한다는 것을 알 수 있을까?
*
* 2.수도코드
* */
public class 오큰수_012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] answer = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i=1; i<N; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                answer[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(answer[i] + " ");
        }
        System.out.println(sb.toString());
        br.close();
    }
}

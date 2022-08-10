package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
* https://www.acmicpc.net/problem/1874
*
* 1.분석
* 데이터크기:100,000
* 제한시간: 2초
*
*
* 2.수도코드
*
* */
public class 스택수열_011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int i=0; i<n; i++) {
            int value = Integer.parseInt(br.readLine());

            if (start < value) {
                for (int j= start+1; j<=value; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                start = value;
            }
            else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb.toString());
    }
}

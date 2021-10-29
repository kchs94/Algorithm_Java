package 백준.스택;
/*
* 스택 문제
*
* 수도코드
* 1.테스트 케이스 갯수 T를 입력받는다.
* 2.각 행마다 괄호 문자열을 입력받는다.
* 3.
* */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Stack;

public class 괄호_9012 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    // 테스트 케이스 갯수 T 입력
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            String s = br.readLine();
            boolean finish = false;
            Stack<Character> stack = new Stack<>();

            for(int j=0; j<s.length(); j++) {

                char c = s.charAt(j);

                if(c == '(') {
                    stack.push(c);
                } else {
                    if (stack.empty()) {
                        finish = true;
                        break ;
                    } else {
                        stack.pop();
                    }
                }
            }

            if(!stack.empty() || finish)
                sb.append("NO\n");
            else
                sb.append("YES\n");

        }

        System.out.println(sb);
    }
}

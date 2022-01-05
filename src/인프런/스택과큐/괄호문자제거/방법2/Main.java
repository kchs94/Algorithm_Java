package 인프런.스택과큐.괄호문자제거.방법2;

import java.util.Scanner;
import java.util.Stack;
/*
* 수도코드
* 문자열을 한 문자씩 탐색한다
*   만약 문자가 ')'이라면 가장 가까운 '('까지 스택에 쌓인 문자열을 제거한다.
*   만약 ')'이외의 문자라면 스택에 추가한다.
*
* 스택의 사이즈만큼 반복한다.
* 인덱스를 이용해서 스택의 내용물을 조회하여 문자열을 만든다.
* */
public class Main {

    public String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {
            if (ch == ')') {
                while (stack.pop() != '(');
            }
            else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<stack.size(); i++) {
            sb.append(stack.get(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}

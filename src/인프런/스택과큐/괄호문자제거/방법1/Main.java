package 인프런.스택과큐.괄호문자제거.방법1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String str) {
        Stack stack = new Stack();
        for ( char ch : str.toCharArray()) {    // 문자 하나씩 접근해서

            if (ch == ')') {

                while(true) {

                    if ((char)stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    stack.pop();
                }
            }
            else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(true) {
            if(!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            else{
                break;
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}

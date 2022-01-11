package 인프런.스택과큐.쇠막대기.방법1;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        int len = str.length();
        char ch;
        for (int i=0; i<len; i++) {
            ch = str.charAt(i);
            if (ch == '(')  // 막대기 시작부분 이면
                stack.push(ch);
            else {
                if (str.charAt(i-1) == '(') {   // 레이저이면
                    stack.pop();
                    answer += stack.size();
                }
                else {  // 막대기 끝이면
                    stack.pop();
                    answer +=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}

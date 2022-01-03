package 인프런.스택과큐.올바른괄호.방법1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if(ch == '(')
                stack.push(ch);
            else {
                if (stack.isEmpty())    // 비어있는데 팝하면 오류나니깐 미리 검사
                    return answer = "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty())   // 여는 괄호가 많은 경우
            return answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}

package 인프런.스택과큐.후위식연산.방법1;

import java.util.Scanner;
import java.util.Stack;
/*
* Integer를 담을 스택을 선언
* 문자열을 문자 하나하나씩 접근한다.
* 만약 문자가 숫자형 문자이면
*   스택에 넣는다.
* 만약 문자가 연산자라면
*   스택에서 상단 숫자 2개를 꺼낸다.
*   2개의 숫자를 연산자로 계산한다.
*   계산한 결과를 스택에 다시 넣는다.
*
* 마지막 스택에 남아있는 숫자를 출력한다.
* */
public class Main {
    public int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        int a, b, result;
        for (char ch : str.toCharArray()) { // 문자열에서 한 문자씩 접근
            if (ch >= '0' && ch <= '9') // 문자가 숫자형 문자이면
                stack.push(ch - '0');
            else {  // 문자가 연산자라면
                b = stack.pop();    // 연산자 뒤 문자
                a = stack.pop();    // 연산자 앞 문자
                switch (ch) {
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(a-b);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(a/b);
                        break;
                }
            }
        }
        result = stack.peek();
        return result;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.solution(str));
    }
}

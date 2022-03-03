package 백준.단계별문제풀이.스택.균형잡힌세상;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

/*  '(' ,'[', ')', ']'
* 1.여러 줄에 걸쳐서 문자열을 입력받는다.(문자열은 알파벳, 공백, 소괄화, 대괄호로 구성된다. 길이는 100이하이다. 문자열 끝은 "."이다.)
* 2.한행이 입력된 문자열이 "."와 같으면 입력을 종료한다.
* 3.문자열을 한 문자씩 접근한다.
* 4.만약 접근한 문자가 '('또는 '['이면 push한다.
* 5.만약 접근한 문자가 ')'이면 2가지를 확인한다.
* 5-1.스택이 비어있거나 '('이 아닌 경우 "no"를 출력하고 문자열 탐색을 종료한다.
* 5-2. 5-1이 아니면 pop한다.
* 5.만약 접근한 문자가 ']'이면 2가지를 확인한다.
* 5-1.스택이 비어있거나 '['이 아닌 경우 "no"를 출력한다 문자열 탐색을 종료한다.
* 5-2. 5-1이 아니면 pop한다.
* 6.스택이 비어있으면 yes를 출력한다.
* 7.스택이 비어있지 않으면 no를 출력한다.
* */

public class 문제_4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        StringBuilder sb = new StringBuilder();
        while(true) {
            str = br.readLine();

            if(str.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();

            for(int i=0; i<str.length(); i++) {

                char ch = str.charAt(i);
                if(ch == '(' || ch == '[')
                    stack.push(ch);
                else if(ch == ')') {

                    if(stack.empty() || stack.peek() != '(') {
                        sb.append("no\n");
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
                else if(ch == ']') {

                    if(stack.empty() || stack.peek() != '[') {
                        sb.append("no\n");
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }

            if(stack.empty()) {
                sb.append("yes\n");
            }
        }
        System.out.println(sb);
    }
}

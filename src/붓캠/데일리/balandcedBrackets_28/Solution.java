package 붓캠.데일리.balandcedBrackets_28;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.balancedBrackets("()"));
    }
    public boolean balancedBrackets(String str) {
        // 만약 빈문자열을 입력받으면 true를 리턴한다.
        if (str.isEmpty()) return true;
        // 스택을 생성합니다.
        Stack<Character> stack = new Stack();
        // 문자열 길이만큼 순회합니다.
        for (Character bracket : str.toCharArray()) {
            // 만약 여는 브라켓인 경우 스택에 넣습니다.
            if (bracket == '(' || bracket == '{' || bracket == '[')
                stack.push(bracket);
                // 그 외라면(닫는 브라켓인 경우)
            else {
                // 만약 스택의 사이즈가 0이라면 false를 리턴합니다.
                if (stack.size() == 0) return false;
                // 만약 스택 최상단 요소를 확인(peek)해서 같은 종류면 pop합니다.
                if (stack.peek() == '(' && bracket == ')'||
                        stack.peek() == '{' && bracket == '}'||
                        stack.peek() == '[' && bracket == ']')
                    stack.pop();
                else  // 같은 종류가 아니라면 return false를 합니다.
                    return false;
            }
        }

        // 스택 안에 브라켓이 남아 있다면
        if (stack.size() != 0) return false;
        return true;
    }
}

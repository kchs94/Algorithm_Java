package 프로그래머스.레벨2.올바른괄호.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;


public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for ( char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            else {
                if (stack.empty()) {
                    return answer = false;
                }
                stack.pop();
            }
        }

        if (!stack.empty()) {
            answer = false;
        }

        return answer;
    }

    @Test
    void test() {
        Assertions.assertTrue(solution("()()"));
        Assertions.assertTrue(solution("(())()"));
        Assertions.assertFalse(solution(")()("));
        Assertions.assertFalse(solution("(()("));
    }
}

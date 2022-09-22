package 프로그래머스.레벨2.짝지어제거하기;

import java.util.Stack;

/*
 * 스택으로 접근하니 for문 하나로 문제가 풀렸다.
 *
 * */
public class Solution2 {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.empty() && stack.peek() == c)
                stack.pop();
            else
                stack.add(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("cdcd"));
    }
}

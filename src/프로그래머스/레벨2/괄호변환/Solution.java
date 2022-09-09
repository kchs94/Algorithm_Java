package 프로그래머스.레벨2.괄호변환;

import java.util.Stack;
/*
*
* 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
  2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
  3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
    3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
  4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
    4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
    4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
    4-3. ')'를 다시 붙입니다.
    4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
    4-5. 생성된 문자열을 반환합니다.
* */
public class Solution {
    public String solution(String p) {
        if (isRight(p)) //만약 p가 이미 "올바른 괄호 문자열"이라면 그대로 return 하면 됩니다.
            return p;

        return dfs(p);
    }

    // 올바른 괄호인지 알려주는 메서드  (()), )(,  )/////
    public static boolean isRight(String str) {
        Stack stack = new Stack();

        for (char ch : str.toCharArray()) {
            if (ch == '(')
                stack.push(ch);
            else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.size() == 0 ? true : false;
    }

    public static String dfs(String w){

        // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
        if(w.length() == 0){
            return "";
        }

        String u = "";
        String v = "";
        int leftCount = 0;
        int rightCount = 0;

        // 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다
        for(int i=0; i<w.length(); i++){

            if(w.charAt(i) == '(')
                leftCount++;
            else
                rightCount++;

            u += w.charAt(i);
            if(leftCount == rightCount){
                v = w.substring(i+1);
                break;
            }
        }

        // 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
        if(isRight(u))
            return u += dfs(v); // 3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.

        // 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
        else{
            String answer = "(";  // 4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
            answer += dfs(v);     // 4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
            answer += ")";        // 4-3. ')'를 다시 붙입니다.
            u = u.substring(1, u.length()-1);   // 4-4. u의 첫 번째와 마지막 문자를 제거

            // 4-4. 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
            for(int i=0; i<u.length(); i++){
                if(u.charAt(i) =='('){
                    answer += ')';
                }else{
                    answer += '(';
                }
            }

            return answer;    // 생성된 문자열 반환
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution(")("));
        System.out.println(solution.solution("()))((()"));
    }
}

package 프로그래머스.레벨2.짝지어제거하기;
/*
* 단순하게 접근하니깐 정확도는 맞는데 시간초과가 났다.
* 해결이 안떠올라 답안을 보니 다른 사람들은 스택으로 문제를 풀었다.
* 짝이라는 키워드를 보고 스택으로 접근한다.
* */
public class Solution {

    StringBuilder sb = new StringBuilder();

    public int solution(String s)
    {
        int answer = 1;
        while(s.length() != 0) {
            boolean button = false;
            sb = new StringBuilder();
            for (int i=0; i<s.length()-1; i++) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    button = true;
                    String front = s.substring(0,i);
                    String back = s.substring(i+2);
                    s = sb.append(front).append(back).toString();
                    break;
                }
            }
            if (button == false) return 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("cdcd"));
    }
}

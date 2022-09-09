package 프로그래머스.레벨2.문자열압축;
/*
 *
 *
 * */
public class Solution2 {
    public int solution(String s) {
        int answer = s.length();

        if (s.length() == 1) return 1;



        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("abcabcdede"));
    }
}

package 프로그래머스.레벨2.이진변환반복하기;

import java.util.Arrays;
/*
 * 다른 풀이
 * 제거된 0의 갯수를 간접적으로 구하는 방법
 * 회차당 0의 갯수 = s 전체 길이 - 0이 제거된 길이
 *
 * */
public class Solution2 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int convertCount = 0;
        int zeroCount = 0;

        // 3.1과2을 s가 1이 될 때까지 반복한다
        while(!s.equals("1")) {

            zeroCount += s.length();
            s = s.replace("0", "");
            zeroCount -= s.length();

            int sLen = s.length();
            s = Integer.toBinaryString(sLen);
            convertCount++;
        }
        answer[0] = convertCount;
        answer[1] = zeroCount;

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution("110010101001")));
    }
}

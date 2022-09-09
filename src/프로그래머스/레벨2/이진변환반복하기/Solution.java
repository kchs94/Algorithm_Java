package 프로그래머스.레벨2.이진변환반복하기;

import java.util.Arrays;
/*
* 구현문제
*
* 이진 변환
* 1. 문자열 s의 모든 0을 제거한다 (문자열을 변경이 안되니깐 StringBuilder)
* 2. 0이 제거된 s의 길이를 sLen라고 하자. 길이 sLen를 이진법으로 바꾼 문자열을 s로 바꾼다.(Integer.toBinaryString)
*
* 1,2 과정은 s가 1이 될 때까지 반복된다. --> 언제까지 모르니깐 while s.equals("1")
* s가 "1"이 될때까지 계속해서  s에 이진 변환을 가했을 때
* 이진 변환의 횟수(convertCount)와 변환 과정에서 제거된 모든 0의 개수(zeroCount한다)를 각각 배열에 담아 리턴하는 함수를 작성한다.
*
* */
public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int convertCount = 0;
        int zeroCount = 0;

        // 3.1과2을 s가 1이 될 때까지 반복한다
        while(!s.equals("1")) {
            
            // 1. 문자열 x의 모든 0을 제거한다
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '0') {
                    zeroCount++;
                    continue;
                }
                sb.append(ch);
            }
            
            // 2. x의 길이를 c라고 하자. 길이 c를 이진법으로 바꾼 문자열을 x로 바꾼다.
            String x = sb.toString();
            int sLen = x.length();
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

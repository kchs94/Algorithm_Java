package 프로그래머스.레벨2.JadenCase문자열만들기.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(); // 문자열을 더하기 때문에 StringBuilder 사용

        char firstChar = s.charAt(0);
        answer.append(Character.toUpperCase(firstChar));

        for (int i = 1; i < s.length(); i++) {
            char now = s.charAt(i);
            if (s.charAt(i - 1) == ' ') {
                answer.append(Character.toUpperCase(now));
            } else {
                answer.append(Character.toLowerCase(now));
            }
        }

        return answer.toString();
    }

    @Test
    void test() {
        Assertions.assertEquals("3people Unfollowed Me"
                , solution("3people unFollowed me"));
        Assertions.assertEquals("For The Last Week"
                ,solution("for the last week"));
    }
}

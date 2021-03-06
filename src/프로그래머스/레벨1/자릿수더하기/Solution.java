package 프로그래머스.레벨1.자릿수더하기;

// 1.int --> String 자료형 변경
// 2.정수형 배열 선언 단일 문자에 접근하기
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
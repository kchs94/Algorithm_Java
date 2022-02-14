package 프로그래머스.레벨2.다음큰숫자.다른사람풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/*
* 비트 1을 세주는 함수가있다 java.lang.Integer.bitCount(int n)
* 이 함수를 이용하면 빠르게 구할 수 있다.
* */
public class Solution {
    public int solution(int n) {
        int answer = 0;

        int count = Integer.bitCount(n);
        int compareNum = n+1;

        while(true) {
            if (Integer.bitCount(compareNum) == count) {
                answer = compareNum;
                break;
            }
            compareNum++;
        }

        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(83, solution(78));
        Assertions.assertEquals(23, solution(15));
    }
}

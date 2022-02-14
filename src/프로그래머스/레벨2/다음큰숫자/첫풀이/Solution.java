package 프로그래머스.레벨2.다음큰숫자.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/*
* 입력 값의 이진수 구하기
* 입렵 값의 이진수의 1갯수구하기
* 입력값보다 1씩 커지면서 반복
* 이진수 구하기
* 이진수에서 1 갯수 구하기
* 만약 갯수가 같다면 출력
* */
public class Solution {
    public int solution(int n) {
        int answer = 0;
        String input = Integer.toBinaryString(n);
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (ch == '1')
                count++;
        }
        int i = n+1;
        while(true) {
            int tempCount = 0;
            String temp = Integer.toBinaryString(i);
            for (char ch : temp.toCharArray()) {
                if (ch == '1')
                    tempCount++;
            }
            if (count == tempCount) {
                answer = i;
                break;
            }
            i++;
        }

        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(83, solution(78));
        Assertions.assertEquals(23, solution(15));
    }
}

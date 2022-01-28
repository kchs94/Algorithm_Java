package 프로그래머스.레벨1.다트게임;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
*
* */
public class Solution {
    public int solution(String dartResult) {
        char[] darts = dartResult.toCharArray();
        int[] score = new int[3];
        int count = -1;

        for (int i=0; i<darts.length; i++) {
            if (darts[i] >= '0' && darts[i] <= '9') {
                count++;    // 카운트하여 몇 번째 숫자인지 파악
                if (darts[i] == '1' && darts[i+1] == '0') { // 10이니깐
                    score[count] = 10;
                    i++;    // 두 문자를 처리했으니깐 한번 더 증가시킨다.
                } else {    // 0~9까지의 숫자문자면
                    score[count] = darts[i] - '0';  // 숫자문자 - '0' = 진짜 숫자
                }
            } else if (darts[i] == 'D') {
                score[count] = (int)Math.pow(score[count], 2);
            } else if (darts[i] == 'T') {
                score[count] = (int)Math.pow(score[count], 3);
            } else if (darts[i] == '*') {
                if (count > 0) {    // 만약 첫 번째 숫자가 아니면
                    score[count-1] *= 2;    // 바로 앞에 있는 점수를 2배로 올린다.
                }
                score[count] *= 2;  // 현재 숫자도 2배
            } else if (darts[i] == '#') {
                score[count] *= -1;
            }
        }

        return score[0] + score[1] + score[2];
    }

    @Test
    void test() {
        Assertions.assertEquals(37, solution("1S2D*3T"));
        Assertions.assertEquals(9, solution("1D2S#10S"));
        Assertions.assertEquals(3, solution("1D2S0T"));
        Assertions.assertEquals(23, solution("1S*2T*3S"));
        Assertions.assertEquals(5, solution("1D#2S*3S"));
        Assertions.assertEquals(-4, solution("1T2D3D#"));
        Assertions.assertEquals(59, solution("1D2S3T*"));
    }
}

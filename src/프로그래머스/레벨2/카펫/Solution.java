package 프로그래머스.레벨2.카펫;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int count = 0;

        for (int i=yellow; i>0; i--) {

            if (yellow%i != 0) continue;
            count++;

            if ((i+2) * (count+2) - yellow == brown) {
                answer = new int[2];
                answer[0] = i+2;
                answer[1] = count+2;
                return answer;
            }

        }

        return answer;
    }

    @Test
    void test() {
        Assertions.assertArrayEquals(new int[]{4, 3}, solution(10, 2));
        Assertions.assertArrayEquals(new int[]{3, 3}, solution(8, 1));
        Assertions.assertArrayEquals(new int[]{8, 6}, solution(24, 24));
    }
}

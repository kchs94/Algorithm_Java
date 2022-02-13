package 프로그래머스.레벨2.멀쩡한사각형.방법1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        int gcd = getGCD(w, h);

        answer = (long)w*h - (w/gcd + h/gcd -1)*gcd;

        return answer;
    }

    static int getGCD(int a, int b) {

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        while(b != 0) {
            int r = a%b;
            a = b;
            b = r;
        }

        return a;
    }

    @Test
    void test() {
        Assertions.assertEquals(80, solution(8, 12));
    }
}

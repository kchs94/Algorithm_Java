package 프로그래머스.레벨2.멀쩡한사각형.방법2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

/*
* BinInteger를 이용해서 gcd를 빠르게 구하는 방법을 이용하기
* */
public class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();

        answer = (long)w*h - (w/gcd + h/gcd -1)*gcd;

        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(80, solution(8, 12));
    }
}

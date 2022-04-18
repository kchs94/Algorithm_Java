package 프로그래머스.레벨1.나머지가1이되는수찾기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
* n을 x로 나눈 나머지가 1이 되도록하는 가장 작은 x를 구하세요
* - n%x == 1 이어야 한다
* - x를 1부터 1씩 증가하되, 정해진 횟수는 없으므로 where로 무한 루프를 돌린다.
* - n%x == 1일 때 무한 루프를 탈출한다.
* */
public class Solution {
    public int solution(int n) {
        int x = 1;

        while(true) {
            if (n%x == 1) break;
            x++;
        }

        return x;
    }

    @Test
    void test() {
        Assertions.assertEquals(3, solution(10));
        Assertions.assertEquals(11, solution(12));
    }
}

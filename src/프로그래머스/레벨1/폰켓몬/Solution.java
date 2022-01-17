package 프로그래머스.레벨1.폰켓몬;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int allowedNum = nums.length/2; // 허용된 최대 값

        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {    // Set에 데이터 추가
            set.add(x);
        }
        int max = set.size();   // 서로 다른 종류의 포켓몬 수

        if (max > allowedNum)   // 허용된 수보다 더 많다면 결국 허용된 수가 최대값
            max = allowedNum;

        answer = max;
        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(2,solution(new int[]{3,1,2,3}));
        Assertions.assertEquals(3,solution(new int[]{3,3,3,2,2,4}));
        Assertions.assertEquals(2,solution(new int[]{3,3,3,2,2,2}));
    }
}

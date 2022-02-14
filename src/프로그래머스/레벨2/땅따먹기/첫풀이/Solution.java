package 프로그래머스.레벨2.땅따먹기.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    int solution(int[][] land) {
        int answer = 0;
        int numOfRow = land.length;
        for (int i=1; i<land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }

        for (int i=0; i<4; i++) {
            answer = Math.max(answer, land[numOfRow-1][i]);
        }

        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(16, solution(new int[][]{{1,2,3,5},
                {5,6,7,8},
                {4,3,2,1}}));
    }
}

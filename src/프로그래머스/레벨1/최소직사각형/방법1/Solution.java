package 프로그래머스.레벨1.최소직사각형.방법1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
* 2차원 배열 정렬
*
* */
public class Solution {
    public int solution(int[][] sizes) {
        int answer;
        int maxWidth = sizes[0][0];
        int maxHeight = sizes[0][1];
        for (int i=1; i<sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if (sizes[i][0] > maxWidth)
                maxWidth = sizes[i][0];
            if (sizes[i][1] > maxHeight)
                maxHeight = sizes[i][1];
        }
        answer = maxWidth * maxHeight;

        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(4000, solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        Assertions.assertEquals(120, solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        Assertions.assertEquals(133, solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));

    }
}

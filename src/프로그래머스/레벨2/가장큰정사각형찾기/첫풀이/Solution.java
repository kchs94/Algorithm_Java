package 프로그래머스.레벨2.가장큰정사각형찾기.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// 한번에 풀기 실패
public class Solution {
    public int solution(int [][]board)
    {
        int answer = Integer.MIN_VALUE;
        int row = board.length;
        int col = board[0].length;

        int[][] updateMap = new int[row+1][col+1];

        // 배열 복사
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                updateMap[i+1][j+1] = board[i][j];
            }
        }

        // 알고리즘
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=col; j++) {
                if (updateMap[i][j] != 0) {
                    updateMap[i][j] = Math.min(Math.min(updateMap[i-1][j-1], updateMap[i][j-1]),
                            updateMap[i-1][j]) + 1;
                    answer = Math.max(answer, updateMap[i][j]);
                }

            }
        }

        return answer * answer;
    }

    @Test
    void test() {
        int[][] board = {{0,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {0,0,1,0}};
        Assertions.assertEquals(9, solution(board));

        board = new int[][]{{0,0,1,1},
                {1,1,1,1}};
        Assertions.assertEquals(4, solution(board));
    }
}

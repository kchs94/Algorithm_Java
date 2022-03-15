package SKT테스트.문제2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    public int[][] solution(int n, boolean clockwise) {
        int[][] answer = {};

        int[][] map = new int[n][n];
        int total = (n+1)/2;

        for (int k=0; k<total; k++) {

            int i,j;
            for (i = 0; i<n-1; i++ ) {
                for (j=0; j<n-1; j++) {
                    map[i][j] = j+1;
                }
            }
            for (i = 0; i<n-1; i++ ) {
                for (j=0; j<n-1; j++) {
                    map[i][j] = j+1;
                }
            }
            for (i = 0; i<n-1; i++ ) {
                for (j=0; j<n-1; j++) {
                    map[i][j] = j+1;
                }
            }
            for (i = 0; i<n-1; i++ ) {
                for (j=0; j<n-1; j++) {
                    map[i][j] = j+1;
                }
            }


        }


        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(new int[][]{{1, 2, 3, 4, 1}, {4, 5, 6, 5, 2}, {3, 6, 7, 6, 3},{2, 5, 6, 5, 4}, {1, 4, 3, 2, 1}},
                solution(5, true));
    }
}

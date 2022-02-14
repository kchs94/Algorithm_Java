package 프로그래머스.레벨2.행렬의곱셈.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];


        for (int i=0; i<arr1.length; i++) { // 앞 행렬의 행 갯수만큼 반복합니다.

            for (int j=0; j<arr2[0].length; j++) {  // 뒤 행렬의 열 갯수만큼 반복합니다.

                for (int k=0; k<arr1[0].length; k++) {  // 앞 행렬의 열(=뒷 행렬의 행) 갯수만큼 반복합니다.

                    answer[i][j] += arr1[i][k]*arr2[k][j];

                }
            }
        }

        return answer;
    }

    @Test
    void test() {
        Assertions.assertArrayEquals(new int[][]{{1,15}, {15,15}, {15,15}},
                solution(new int[][]{{1,4}, {3,2}, {4,1}}, new int[][]{{3,3} ,{3,3}}));
    }
}

package 프로그래머스.레벨2.최솟값만들기.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*
* 두 배열의 곱의 합이 최소가 되려면 한 배열의 최솟값이 다른 배열의 최댓값과 곱하는 방식이어야 한다.
* */
public class Solution {

    public int solution(int []A, int []B) {
        int answer = 0;
        int size = A.length;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i=0; i<size; i++) {
            answer += A[i] * B[size-(i+1)];
        }

        return answer;
    }

    @Test
    void test() {
        int[] A = {1, 4, 2};
        int[] B = {5, 4 ,4};
        Assertions.assertEquals(29, solution(A, B));

        A = new int[]{1, 2};
        B = new int[]{3, 4};
        Assertions.assertEquals(10, solution(A, B));
    }
}

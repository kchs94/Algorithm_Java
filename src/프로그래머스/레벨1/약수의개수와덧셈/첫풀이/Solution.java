package 프로그래머스.레벨1.약수의개수와덧셈.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {
    public int solution(int left, int right) {
        int answer;
        int sum = 0;

        for (int i=left; i<=right; i++) {   // left부터 right 값까지 검사한다.
            int num = findNumOfDivisor(i);  // 이 메소드는 약수의 갯수를 반환한다.

            if (num%2 == 0) // 만약 약수의 갯수가 짝수면
                sum += i;
            else    // 만약 약수의 갯수가 홀수면
                sum -=i;
        }

        answer = sum;
        return answer;
    }

    private int findNumOfDivisor(int num) {
        int count = 0;

        for (int i=1; i<=num; i++) {
            if (num%i == 0)
                count++;
        }
        return count;
    }

    @Test
    void test() {
        Assertions.assertEquals(solution(13,17), 43);
        Assertions.assertEquals(solution(24,27), 52);
    }
}

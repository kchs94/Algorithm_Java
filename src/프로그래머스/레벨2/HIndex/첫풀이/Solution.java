package 프로그래머스.레벨2.HIndex.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i=citations.length; i>=0; i--) {
            int count =0;
            for (int j= citations.length-1; j>=0; j--) {
                if (citations[j] >= i)
                    count++;
                else
                    break;
            }
            if (count >= i) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(3, solution(new int[]{3,0,6,1,5}));
    }
}

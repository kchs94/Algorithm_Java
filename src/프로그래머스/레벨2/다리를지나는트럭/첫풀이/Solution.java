package 프로그래머스.레벨2.다리를지나는트럭.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int second = 0;
        Queue<Integer> q = new LinkedList<>();
        int next = 0;
        while (true) {
            second++;
            int sum = 0;
            for (int item : q) {
                sum += item;
            }

            if (q.size() <= bridge_length && (weight - sum) > truck_weights[next] ) {
                q.offer(truck_weights[next]);
            }
        }

//        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(8, solution(2, 10, new int[]{7,4,5,6}));
        Assertions.assertEquals(101, solution(100, 100, new int[]{10}));
        Assertions.assertEquals(110, solution(100, 100, new int[]{10,10,10,10,
        10,10,10,10,10,10}));
    }
}

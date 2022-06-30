package 프로그래머스.고득점키트.힙.더맵게.두번째풀이;

import java.util.*;

public class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Long> q = new PriorityQueue<>();
        for (int i=0; i<scoville.length; i++) {
            q.offer((long)scoville[i]);
        }
        q.peek();
        int answer = 0;
        // 0. 전체 음식의 스코빌 지수가 K이상 인지 확인합니다. = 스코빌이 가장 작은 음식이 K이상인지 확인합니다.
        while (q.peek() < K) {

            // 배열 길이가 2이상이면 answer++;
            if (q.size() >= 2) answer++;
            // 배열 길이가 1이라면 return -1
            else return -1;

            // 1. scoville 배열에서 스코빌 지수가 가장 낮은 두 음식을 찾습니다.
                // - 새로운 음식을 추가 long 타입으로 하기
                // - 낮은 두 음식은 제거
            long first = q.poll();
            long second = q.poll();

            // 2. 두 음식을 섞어 새로운 음식을 만듭니다. 새로운 음식의 스코빌 지수 = 가장 덜 매운 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
            long newFood = first + (second * 2);
            q.offer(newFood);
        }

        // - 모두 k이상이면 answer리턴
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{1,2,3,9,10,12}, 7));
    }
}

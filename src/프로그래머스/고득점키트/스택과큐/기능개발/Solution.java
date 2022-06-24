package 프로그래머스.고득점키트.스택과큐.기능개발;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];  // 작업의 갯수는 100개 이하므로
        int day = 0;

        for (int i=0; i<progresses.length; i++) {
            while (progresses[i] + speeds[i] * day < 100) {
                day++;
            }
            temp[day]++;
        }

        int count = 0;

        for (int n : temp ) {
            if (n != 0)
                count++;
        }
        int[] answer = new int[count];

        int index = 0;

        for (int n : temp)
            if (n != 0) {
                answer[index++] = n;
            }

        return answer;
    }
}

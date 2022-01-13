package 프로그래머스.레벨1.없는숫자더하기;
/*
* 0~9중 없는 숫자를 더한 값을 리턴 = 0~9를 합을 구하고 있는 숫자를 모두 뺀 값
*
* */
public class Solution {
    public int solution(int[] numbers) {
        int answer;
        int sum = 45;   // 0~9까지 합

        for (int x : numbers)   // 있는 원소를 빼준다.
            sum -= x;
        answer = sum;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] test1 = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(s.solution(test1));

        int[] test2 = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(s.solution(test2));
    }
}

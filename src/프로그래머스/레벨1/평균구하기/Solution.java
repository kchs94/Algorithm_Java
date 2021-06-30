package 프로그래머스.레벨1.평균구하기;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for(int i=0; i<arr.length; i++) // 모든 요소 값 더하기
            answer += arr[i];

        answer = answer/arr.length;     //평균 = 요소 총 합 / 요소의 갯수

        return answer;
    }
}
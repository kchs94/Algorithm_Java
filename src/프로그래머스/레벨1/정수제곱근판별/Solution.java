package 프로그래머스.레벨1.정수제곱근판별;
class Solution {
    public long solution(long n) {
        long answer = 0;
        // 제곱근이 정수인지 판별하기
        if(Math.sqrt(n) - (int) Math.sqrt(n) != 0.0){
            answer =-1L;
            return answer;
        }
        answer = (long)((Math.sqrt(n)+1)*(Math.sqrt(n)+1));

        return answer;
    }
}
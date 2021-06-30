package 프로그래머스.레벨1.짝수와홀수;

class Solution {
    public String solution(int num) {
        String answer;

        if(num%2 == 0) answer = "Even"; // 짝수: 2로 나눌 때 나머지 0
        else answer = "Odd";    //홀수: 2로 나눌 때 나머지 1

        return answer;
    }
}
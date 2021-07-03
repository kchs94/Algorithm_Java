package 프로그래머스.레벨1.문자열다루기기본;

// Solution
//1. s.length() == 4 && s.length() == 6 &&하고 || 중에 잘 선택하기
//2. s.charAt() < '0 || '9' < s.charAt()

class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() != 6){
            answer = false;
            return answer;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) < '0' || '9' < s.charAt(i)){
                answer = false;
                return answer;
            }
        }
        return answer;
    }
}

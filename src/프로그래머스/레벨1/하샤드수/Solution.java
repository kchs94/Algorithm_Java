package 프로그래머스.레벨1.하샤드수;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sumOfDigits = 0; // 각 자리수 값의 합
        int origin = x; // 첫 값

        //x의 자리수 합 구하기
        while(x !=0){
            sumOfDigits += x%10;
            x = x/10;
        }

        if(origin%sumOfDigits !=0)
            answer = false;

        return answer;
    }
}
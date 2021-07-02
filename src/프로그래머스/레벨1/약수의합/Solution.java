package 프로그래머스.레벨1.약수의합;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n/2; i++){    // n 이하의 자연수 중 중간값 이상에 약수는 자기 자신밖에 없다.
            if(n%i == 0)    // 나누어 떨어지면 약수
                answer +=i;
        }
        answer += n;    // 약수의 마지막은 그 값이다
        return answer;
    }
}
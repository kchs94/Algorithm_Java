package 프로그래머스.레벨1.수박수박수박수박수박수;

class Solution {
    public String solution(int n) {
        String answer = "";
        // solution: 홀수 일 때는 '수' 짝수일 때는 '박'을 붙이는
        //StringBuilder 인스턴스 생성
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n; i++)
            sb.append(i%2==0?"박":"수");

        answer = sb.toString();
        return answer;
    }
}
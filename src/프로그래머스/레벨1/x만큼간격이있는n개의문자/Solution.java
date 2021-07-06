package 프로그래머스.레벨1.x만큼간격이있는n개의문자;
// 길이가 변하는게 아니니 정수형 배열로 접근

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++){
            answer[i] = x + (long)x*i;  //int 한계 10억 오버플로 방지
        }
        return answer;
    }
}
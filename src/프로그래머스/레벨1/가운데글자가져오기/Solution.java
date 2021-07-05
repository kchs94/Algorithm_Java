package 프로그래머스.레벨1.가운데글자가져오기;

//1.문자열 s의 길이가 짝수이면 가운데 두 글자 반환
//
//2.문자열 s의 길이가 홀수이면 가운데 한 글자 반환

class Solution {
    public String solution(String s) {
        String answer = "";

        if(s.length()%2 == 0){   // s의 길이가 짝수이면{
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }
        else{   // 홀수이면
            answer = s.substring(s.length()/2, s.length()/2 +1);
        }
        return answer;
    }
}

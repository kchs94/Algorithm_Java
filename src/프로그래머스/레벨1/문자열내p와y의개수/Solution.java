package 프로그래머스.레벨1.문자열내p와y의개수;


//1.문자열 s의 모든 문자 소문자로 바꾸기: s.toLowerCase()
//2.p와 y 모두 하나도 없는 경우: s.charAt() == 'p' || s.charAt(i) == 'y'
// answer = true

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        boolean exist = false;

        s = s.toLowerCase(); // 소문자로 바꾸기
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                count++;
                exist = true;
            }
            else if(s.charAt(i) == 'y'){
                count--;
                exist = true;
            }
        }

        if(count == 0 && exist == true)
            answer = true;

        return answer;
    }
}

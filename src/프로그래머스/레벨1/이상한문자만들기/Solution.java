package 프로그래머스.레벨1.이상한문자만들기;

class Solution {
    public String solution(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();


        for(int i=0; i<s.length(); i++){    // 한 문자씩 접근
            if(s.charAt(i) == ' '){ // 공백 문자 일 경우
                sb.append(' ');
                index = 0;
            }
            else{
                if(index%2 == 0){   // 짝수
                    sb.append(Character.toUpperCase(s.charAt(i)));
                }
                else{   // 홀수
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
                index++;
            }
        }
        return sb.toString();
    }
}
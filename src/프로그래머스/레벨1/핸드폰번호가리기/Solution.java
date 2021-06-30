package 프로그래머스.레벨1.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        //sol
        // 1.문자열의 크기를 구하고 (문자열의 크기 - 4)번 앞에서부터 문자열 요소를 *로 대체한다.
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<phone_number.length()-4; i++){
            sb.append('*');
        }
        sb.append(phone_number.substring(phone_number.length()-4,phone_number.length()));
        answer = sb.toString();

        return answer;
    }
}

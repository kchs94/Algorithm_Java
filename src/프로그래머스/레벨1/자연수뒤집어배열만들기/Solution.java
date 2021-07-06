package 프로그래머스.레벨1.자연수뒤집어배열만들기;
// 1.long --> array하려면  일단 배열의 길이를 모르니깐 문자열로 변환하여 길이 정보를 얻는다.
// 2.역순으로 하려면 charAt() 수항할 시 인덱스를 역순으로 접근한다.

class Solution {
    public int[] solution(long n) {
        String temp = String.valueOf(n);
        int[] answer = new int[temp.length()];

        for(int i=0; i<temp.length(); i++){
            answer[i] = temp.charAt(temp.length()-(i+1)) - '0';
        }


        return answer;
    }
}
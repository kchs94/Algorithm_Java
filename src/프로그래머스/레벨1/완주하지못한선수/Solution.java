package 프로그래머스.레벨1.완주하지못한선수;
import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<participant.length; i++){
            if(i == participant.length-1){
                answer = participant[participant.length-1];
                break;
            }
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }

        return answer;
    }
}
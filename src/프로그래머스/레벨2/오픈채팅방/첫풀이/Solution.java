package 프로그래머스.레벨2.오픈채팅방.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        Map<String, String> map = new HashMap<>();
        int count=0; // 결과 배열의 길이를 저장하기위해 선언

        for (int i=0; i< record.length; i++) {
            String[] temp = record[i].split(" ");
            String command = temp[0];   // 명령어
            String id = temp[1];        // 아이디
            String nickName = null;     // 닉네임

            if (command.equals("Enter")) {  // 입장
                nickName = temp[2];
                map.put(id, nickName); // 키:id 값:닉네임
                count++;
            }
            else if (command.equals("Leave")) {
                count++;
            }
            else {  // Change
                nickName = temp[2];
                map.put(id, nickName);
            }
        }
        answer = new String[count]; // "Enter"과 "Leave"가 언급됫 횟수만큼 배열을 선언

        count = 0;  // 0으로 다시 초기화

        for (int i=0; i< record.length; i++) {
            String[] temp = record[i].split(" ");
            String command = temp[0];
            String id = temp[1];
            
            if (command.equals("Enter")) {
                answer[count] = map.get(id) + "님이 들어왔습니다.";
                count++;
            }
            else if (command.equals("Leave")) {
                answer[count] = map.get(id) + "님이 나갔습니다.";
                count++;
            }
            else {
                continue;
            }
        }

        return answer;
    }

    @Test
    void test() {
        Assertions.assertArrayEquals(new String[]{"Prodo님이 들어왔습니다.",
                "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."}
        , solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                        "Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}));

    }
}

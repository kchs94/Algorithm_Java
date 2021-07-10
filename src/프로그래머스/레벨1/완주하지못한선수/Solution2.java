package 프로그래머스.레벨1.완주하지못한선수;

import java.util.HashMap;

// 해시를 이용한 풀이
public class Solution2 {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer = "";

        // 해시 만들기
        HashMap<String, Integer> hm = new HashMap<>();

        // Add Participant to HashMap
        for(String player: participant)
            hm.put(player, hm.getOrDefault(player, 0) + 1 );

        // 해시맵에서 완주한 선수들 빼기
        for(String player: completion)
            hm.put(player, hm.get(player) - 1);

        // 0이 아닌 참가자 찾기
        for(String key :hm.keySet()){
            if(hm.get(key) != 0){
                answer = key;
                break;
            }
        }
        System.out.println(answer);
    }
}

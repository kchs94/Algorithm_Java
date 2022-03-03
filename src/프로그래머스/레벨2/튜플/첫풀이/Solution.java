package 프로그래머스.레벨2.튜플.첫풀이;

import com.sun.security.jgss.GSSUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        Map<Character, Integer> map = new HashMap<>();

        String temp = s.replaceAll("[{}]", "");

        for (char ch : temp.toCharArray()) {
            if (ch == ',')
                continue;
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }

        answer = new int[map.size()];
        List<Character> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        int i=0;
        for (Character key : keySet) {
            answer[i] = map.get(key);
            i++;
        }

        return answer;
    }

    @Test
    void test() {
        Assertions.assertArrayEquals(new int[]{2,1,3,4}, solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"));
//        Assertions.assertArrayEquals(new int[]{2,1,3,4}, solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"));
//        Assertions.assertArrayEquals(new int[]{111,20}, solution("{{20,111},{111}}"));
//        Assertions.assertArrayEquals(new int[]{123}, solution("{{123}}"));
//        Assertions.assertArrayEquals(new int[]{3,2,4,1}, solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"));
    }
}

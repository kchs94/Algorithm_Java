package 인프런.해시맵과트리셋.학급회장.방법1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public char solution(int n, String str) {
        char answer = ' ';
        Map<Character, Integer> map = new HashMap<>();  // 해시맵 선언
        for (char key : str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1); // 키가 없을 수도 있으니깐
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) { // ketSet() 메소드를 이용해 키를 탐색
            if(max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }

        // 다양한 Map 메소드
        System.out.println(map.size());
        System.out.println(map.remove('A'));
        System.out.println(map.containsKey('F'));
        
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        System.out.println(T.solution(n, str));
    }
}

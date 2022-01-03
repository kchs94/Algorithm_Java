package 인프런.해시맵과트리셋.아나그램.방법1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
* 아나그램: 어느 한 단어를 재배열해서 다른 단어와 같게 만들 수 있으면 아나그램이라 한다.
* 아나그램 판별시 대소문자는 구분된다.
*
* */
public class Main {
    public String solution(String str1, String str2) {
        String answer = "YES";
        Map<Character, Integer> map = new HashMap<>();

        for ( char key : str1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for ( char key : str2.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) - 1);
        }

        for ( char key : map.keySet()) {
            if(map.get(key) != 0)
                answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(T.solution(str1, str2));
    }
}

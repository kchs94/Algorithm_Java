package 프로그래머스.레벨1.문자열내마음대로정렬하기;

// 1.ArrayList를 생성한다.
// 2.ArrayList에 i번째 단일문자를 각 요소 앞에 붙인다.
// 3.ArrayList.sort()를 하여 오름차순으로 만든다.
// 4.리스트를 다시 배열로 만든다.
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> arrList = new ArrayList<>();

        for(int i=0; i<strings.length; i++){
            arrList.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arrList);

        String[] answer = new String[strings.length];

        for(int i=0; i<strings.length; i++){
            answer[i] = arrList.get(i).substring(1);
        }

        return answer;
    }
}
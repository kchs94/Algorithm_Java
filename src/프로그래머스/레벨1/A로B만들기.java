package 프로그래머스.레벨1;

import java.util.Arrays;

/*
 * A로 B를 만들 수 있다 = 순서 상관 x, 갯수 중요
 * 문자열을 정렬한 뒤에 같은 문자열이면 1 아니면 0
 * */
public class A로B만들기 {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        String beforeStr = new String(beforeArr);
        String afterStr = new String(afterArr);

        return beforeStr.equals(afterStr) ? 1 : 0;
    }
}

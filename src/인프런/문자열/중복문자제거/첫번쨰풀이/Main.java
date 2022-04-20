package 인프런.문자열.중복문자제거.첫번쨰풀이;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 소문자 한 개 문자열이 입력되면 중복된 문자가 제거되고, 순서를 유지하는 문자열을 출력하세요.
* - 문자열을 각 문자씩 앞에서부터 접근합니다.
* - 문자에 접근하고 앞에서 나온적이 있는지 검사합니다.
* - 나온적이 없으면 문자를 붙이고, 나온적이 있으면 통과합니다.
* */
public class Main {
    public static String solution(String str) {
        ArrayList<Character> usedLetters = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!usedLetters.contains(ch)) {
                sb.append(ch);
                usedLetters.add(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}
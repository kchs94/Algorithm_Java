package 인프런.문자열.문장속단어;

import java.util.Scanner;

/*
 * - 공백을 기준으로 문자열을 분리합니다.
 * - 분리된 문자열의 길이를 비교하여 비교하는 대상 문자열의 길이가 이전보다 길면 해당 문자열을 저장합니다.
 * */
public class Main {
    public static String solution(String str) {
        // 공백을 기준으로 문자열을 분리합니다.
        String[] words = str.split(" ");

        // 분리된 문자열을 비교
        String answer = "";
        int maxWordLen = Integer.MIN_VALUE;
        for (String word : words) {
            if (maxWordLen < word.length()) {
                maxWordLen = word.length();
                answer = word;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }
}
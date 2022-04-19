package 인프런.문자열.단어뒤집기.StringBuilder이용;

import java.util.Scanner;

public class Main {
    public static String[] solution(int n, String[] str) {
        String[] reverseWords = new String[n];  // 뒤집은 문자열을 담을 배열

        StringBuilder sb;
        for (int i=0; i<n; i++) {
            sb = new StringBuilder(str[i]).reverse();   // 생성자 인자로 문자열 입력 후 뒤집기
            reverseWords[i] = sb.toString();    // 문자열로 다시 변환
        }

        return reverseWords;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] words = new String[n];
        for (int i=0; i<n; i++) {
            words[i] = in.next();
        }
        for (String reverseWord : solution(n, words)) {
            System.out.println(reverseWord);
        }
    }
}
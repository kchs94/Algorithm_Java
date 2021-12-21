package 인프런.문자열.유효한팰린드롬.방법1;

import java.util.Scanner;

/*
* 앞뒤가 같은 문자열인지 판단하는 문제
* 알파벳만 회문검사하고 대소문자는 무시
* 알파벳 이외 문자들은 무시
*
* */
public class Main {

    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");   // 대문자가 아닌 문자는 다 사라지게 한다.

        String reverse = new StringBuilder(str).reverse().toString();

        if(str.equals(reverse))
            answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine(); // 공백도 있으니깐 한줄로 입력받는다.
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}

package 인프런.문자열.회문문자열.풀이2;

import java.util.Scanner;
/*
* StringBuilder reverse()
* String.equalsIgnoreCase() 이용하기
* */
public class Main {
    public String solution(String str) {
        String answer = "NO";  // 디폴트로 NO 설정
        String reverse = new StringBuilder(str).reverse().toString();   // StringBuilder를 사용하여 문자열 뒤집기

        if(str.equalsIgnoreCase(reverse))   // equalsIgnoreCase()를 사용하여 대소문자 상관없이 문자열 비교하기
            return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(); // 문자열 입력
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}

package 인프런.문자열.회문문자열.내풀이;

import java.util.Scanner;
/*
* 짝,홀수 길이에 상관없이 길이/2의 값을 인덱스로가지는 위치 전까지 반복한다.
* 대소문자 구분하지 않음 --> 문자열을 대문자 또는 소문자로 변환한다.
* */
public class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for(int i=0; i<len/2; i++) {

            if(str.charAt(i) != str.charAt(len-(1+i))) {    // 다르다면 바로 반복을 끝낸다.
                return "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(); // 문자열 입력

        Main T = new Main();
        System.out.println(T.solution(str));
    }
}

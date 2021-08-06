package 코드업.문자열;

import java.util.Scanner;

public class 문제_1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();    // 단어 입력

        for(int i=0; i<word.length(); i++){ // 문자 갯수 만큼 반복
            System.out.println("'" + word.charAt(i) + "'"); // 문자 별 출력하기
        }
    }
}

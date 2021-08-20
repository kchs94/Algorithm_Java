package 코드업.문자열;

import java.util.Scanner;

public class 문제_1406 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String verb = in.next();

        if(verb.equals("love")) // 입력된 문자열이 "love"인지 확인
            System.out.println("I " + verb + " you.");
    }
}

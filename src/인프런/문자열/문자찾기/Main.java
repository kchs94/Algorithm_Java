package 인프런.문자열.문자찾기;

import java.util.Scanner;

/*
 * - 한 개의 문자열을 입력받는다.
 * - 한 개의 특정 문자를 입력받는다.
 * - 일치하는 문자가 있으면 카운트할 변수를 선언한다.
 * - 문자열의 길이만큼 반복하며 한 문자씩 순회한다.
 * - 특정 문자와 순회하는 문자가 일치하면 카운트를 증가시킨다.
 *
 * 대소문자를 구분하지 않는다는 점을 처리하는 게 어려울 수 있다.
 * 이를 해결하기 위해 처음 입력받은 문자열과 문자를 모두 소문자화하여 대소문자 문제를 해결한다.
 * */
public class Main {
    public static int solution(String str, char ch) {
        str = str.toLowerCase(); // 문자열을 소문자화한다.
        ch = Character.toLowerCase(ch); // 특정 문자를 소문자화한다.

        int count = 0;  // 카운트 변수를 선언한다.
        for (char x : str.toCharArray()) {  // 문자열 길이만큼 반복하여 한 문자씩 접근한다.
            if (x == ch)    // 접근한 문자가 특정 문자와 일치하면
                count++;    // 카운트 변수를 증가시킨다.
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(); // 문자열을 입력받는다
        char ch = in.next().charAt(0);  // 문자를 입력받는다
        System.out.println(solution(str, ch));
    }
}

package 백준.단계별문제풀이.문자열;
import java.util.Scanner;
/*
* url:https://www.acmicpc.net/problem/11654
* 문제: 알파엣 소문자, 대문자, 숫자 0~9중 하나를 입력하면 주어진 문자의 아스키 코드의 값을 출력하세요.
*
* */
public class 아스키코드_11654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // Scanner은 char형을 바로 받는 메소드가 없습니다. Stirng에서 char로
                                                // 바꿔야 합니다.
        char c = in.next().charAt(0);   // 문자 하나를 입력받을 땐 next()로 문자열을 입력받은 뒤 charAt(0)을 이용한다.

        int asciiCode = c;
        System.out.println(asciiCode);
    }
}

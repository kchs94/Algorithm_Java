package 코드업.입출력및연산자;
// Integer 클래스 valueOf(문자열, 진수)
// 8진수로 입력된 정수 10진수 정수로 바꾸기.
import java.util.Scanner;

public class 문제_1034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        int number = Integer.valueOf(str, 8);   // 진법 바꾸기.

        System.out.println(number);
    }
}

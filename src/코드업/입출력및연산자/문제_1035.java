package 코드업.입출력및연산자;
// 문자열로 입력 --> 16진법으로 변환 --> 8진법으로 출력
import java.util.Scanner;

public class 문제_1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        int hexadicimal = Integer.valueOf(str, 16);

        System.out.printf("%o", hexadicimal);
    }
}

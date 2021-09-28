package 코드업.문자열;
/*
* 수도코드
* 엄청 큰 숫자를 입력받는다
* IF 엄청큰 숫자가 3의 배수이면 DO
*   "1"을 출력한다.
* ELSE
*   "0"을 출력한다.
*/
import java.math.BigInteger;
import java.util.Scanner;

public class 삼의배수판별_1990 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(in.next());

        if( bigInteger.remainder(new BigInteger("3")).compareTo(new BigInteger("0"))== 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}

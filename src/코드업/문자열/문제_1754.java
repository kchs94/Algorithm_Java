package 코드업.문자열;

import java.math.BigDecimal;
import java.util.Scanner;

public class 문제_1754 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal bigNum1 = new BigDecimal(in.next());
        BigDecimal bigNum2 = new BigDecimal(in.next());

        if(bigNum1.compareTo(bigNum2) < 0)  // 인자 값보다 작으면 음수 크면 양수 같으면 0
            System.out.print(bigNum1 + " " + bigNum2);
        else
            System.out.print(bigNum2 + " " + bigNum1);
    }
}

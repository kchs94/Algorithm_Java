package 코드업.스택;

import java.math.BigInteger;
import java.util.Scanner;

public class 문제_3021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger bigInteger1 = new BigInteger(in.next());
        BigInteger bigInteger2 = new BigInteger(in.next());

        System.out.println(bigInteger1.add(bigInteger2));
    }
}

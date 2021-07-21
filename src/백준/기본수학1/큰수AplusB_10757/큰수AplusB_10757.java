package 백준.기본수학1.큰수AplusB_10757;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰수AplusB_10757 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger A = new BigInteger(in.next());
        BigInteger B = new BigInteger(in.next());

        A = A.add(B);

        System.out.println(A.toString());
    }
}

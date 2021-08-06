package 코드업.중첩반복문;

import java.util.Scanner;

public class 문제_1082 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(16);
        for(int i=1; i<16; i++)
            System.out.printf("%x*%x=%x\n".toUpperCase(), n, i, n*i);
    }
}

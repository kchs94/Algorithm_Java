package 코드업.재귀함수;

import java.util.Scanner;

public class 문제_1920 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int decimal = in.nextInt();
        System.out.println(getBinary(decimal));
    }

    private static String getBinary(int decimal) {
        if(decimal == 1)
            return "1";
        else if(decimal == 0)
            return "0";
        return  getBinary(decimal/2) + decimal%2;
    }
}

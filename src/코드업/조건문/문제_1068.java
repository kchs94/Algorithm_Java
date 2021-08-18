package 코드업.조건문;

import java.util.Scanner;

public class 문제_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();

        if(90 <= num) System.out.println('A');
        else if(70 <= num)   System.out.println('B');
        else if(40 <= num)   System.out.println('C');
        else if(00 <= num)   System.out.println('D');

    }
}

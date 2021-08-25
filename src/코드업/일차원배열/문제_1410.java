package 코드업.일차원배열;

import java.util.Scanner;

public class 문제_1410 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int numOfLeft = 0;
        int numOfRight = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(') numOfLeft++;
            else if(str.charAt(i) == ')') numOfRight++;
            else continue;
        }

        System.out.println(numOfLeft + " " + numOfRight);
    }
}

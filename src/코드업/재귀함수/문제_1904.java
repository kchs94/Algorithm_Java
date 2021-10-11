package 코드업.재귀함수;

import java.util.Scanner;

public class 문제_1904 {

    public static void oddPrint(int from, int to){

        if(from > to)
            return ;

        oddPrint(from, to-1);
        if (to%2 !=0)
            System.out.print(to + " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int from = in.nextInt();
        int to = in.nextInt();

        oddPrint(from, to);
    }
}

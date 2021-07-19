package 백준.기본수학1.손익분기점_1712;

import java.util.Scanner;

public class 손익분기점_1712_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if( C<= B) {
            System.out.println("-1");
        }
        else{
            System.out.println((A/(C-B))+1);
        }
    }
}

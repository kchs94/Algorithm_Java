package 백준.단계별문제풀이.IF문;

import java.util.Scanner;

public class 사분면고르기_14681 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int Y = in.nextInt();

        if(0<X && 0<Y) System.out.print("1");
        else if(X<0 && 0<Y) System.out.print("2");
        else if(X<0 && Y<0) System.out.print("3");
        else System.out.print("4");
    }
}

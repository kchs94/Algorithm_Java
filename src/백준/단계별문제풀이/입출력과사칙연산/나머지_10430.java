package 백준.단계별문제풀이.입출력과사칙연산;

import java.util.Scanner;

public class 나머지_10430 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        in.close();

        System.out.println( (A+B)%C );
        System.out.println( ((A%C) + (B%C))%C );
        System.out.println( (A*B)%C );
        System.out.println( ((A%C) * (B%C))%C );
    }
}

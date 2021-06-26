package 백준.IF문;

import java.util.Scanner;

public class 시험성적_9498 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();

        in.close();

        if(90<=A && A<=100) System.out.println("A");
        else if(80<=A) System.out.println("B");
        else if(70<=A) System.out.println("C");
        else if(60<=A) System.out.println("D");
        else System.out.println("F");
    }
}

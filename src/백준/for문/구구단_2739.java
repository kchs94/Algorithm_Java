package 백준.for문;

import java.util.Scanner;

public class 구구단_2739 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        in.close();

        for(int i=1; i<10; i++){    // 9번 반복
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}

package 백준.단계별문제풀이.for문;

import java.util.Scanner;

public class 별찍기1_2438 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.close();

        for(int i=1; i<=N; i++){        //행 갯수
            for(int j=1; j<=i; j++)     //열 갯수
                System.out.print("*");
            System.out.println();
        }
    }
}

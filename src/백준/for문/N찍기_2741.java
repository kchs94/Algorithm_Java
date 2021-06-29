package 백준.for문;

import java.util.Scanner;


public class N찍기_2741 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();       //자연수 N이 주어졌을 때,

        in.close();

        for(int i=1; i<=N; i++)     //1부터 N까지 한 줄에 하나씩 출력
            System.out.println(i);
    }
}

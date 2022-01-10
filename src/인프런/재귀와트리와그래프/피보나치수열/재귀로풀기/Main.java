package 인프런.재귀와트리와그래프.피보나치수열.재귀로풀기;

import java.util.Scanner;

public class Main {

    public int fibo(int N) {
        if (N == 1)
            return 1;
        else if (N == 2)
            return 1;
        else return fibo(N-2) + fibo(N-1);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i=1; i<=N; i++) {
            System.out.print(T.fibo(i) + " ");
        }
    }
}

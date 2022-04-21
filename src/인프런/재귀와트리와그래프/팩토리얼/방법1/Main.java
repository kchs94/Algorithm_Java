package 인프런.재귀와트리와그래프.팩토리얼.방법1;

import java.util.Scanner;

public class Main {
    public static int recursion(int n) {
        if (n==0) { // 0!이면 탈출
            return 1;
        }
        else {
            return n * recursion(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recursion(n));
    }
}
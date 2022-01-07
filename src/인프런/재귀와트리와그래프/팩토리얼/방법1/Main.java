package 인프런.재귀와트리와그래프.팩토리얼.방법1;

import java.util.Scanner;

public class Main {
    public int factorial(int n) {
        if (n == 1) // 탈출문
            return 1;
        else
            return n * factorial(n-1);  // 자기 자신 호출
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.factorial(n));
    }
}

package 인프런.재귀와트리와그래프.재귀함수.방법1;

import java.util.Scanner;

/*
 * f(n) = f(n-1) + 1;
 * 재귀함수 함수를 정의할 때 자기 자신을 다시 사용하는 함수.
 * */
public class Main {
    public static void recursion(int n) {
        if (n == 0) return ;
        else {
            recursion(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recursion(n);
    }
}
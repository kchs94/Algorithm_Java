package 인프런.재귀와트리와그래프.재귀함수.방법1;

import java.util.Scanner;
/*
* 재귀함수는 스택처럼 메소드 정보(지역 변수, 매개변수, 복귀주소)가쌓인다.
*
*
* */
public class Main {
    public void recursion(int n) {
        if(n == 0) return;
        else {
            recursion(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        T.recursion(n);
    }
}

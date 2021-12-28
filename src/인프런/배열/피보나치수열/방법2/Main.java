package 인프런.배열.피보나치수열.방법2;

import java.util.Scanner;
/*
* 배열을 사용하지 않고 풀어보기
* */
public class Main {

    public void solution(int n) {
       int a=1, b=1, temp;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<n; i++) {
            System.out.print(a+b + " ");
            temp = b;
            b = a+b;
            a = temp;
        }
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        T.solution(num);
    }
}

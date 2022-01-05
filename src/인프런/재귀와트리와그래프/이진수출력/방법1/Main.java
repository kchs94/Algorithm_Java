package 인프런.재귀와트리와그래프.이진수출력.방법1;

import java.util.Scanner;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public void recursive(int n) {
        if (n == 0) {
            return;
        }
        else {
            recursive(n/2);
            sb.append(n % 2);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        T.recursive(n);
        System.out.println(sb.toString());
    }
}

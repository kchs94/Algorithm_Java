package 프로그래머스.레벨1;

import java.util.Scanner;

public class 직각삼각형출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=n; i++) {
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}

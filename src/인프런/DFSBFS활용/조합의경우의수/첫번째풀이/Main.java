package 인프런.DFSBFS활용.조합의경우의수.첫번째풀이;

import java.util.Scanner;

/*
* 조합 경우의 수 구하기
*
* nCr = (n-1)C(r-1) + (n-1)Cr
* nCn == 1
* nC0 == 1
*
* 첫 번째 풀이
* 메모이제이션 사용하지 않고 재귀적으로 풀기
* */
public class Main {
    public static int combination(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }
        else {
            return combination(n-1, r-1) + combination(n-1, r);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // n개의 수
        int r = in.nextInt();   // r개를 뽑기
        System.out.println(combination(n,r));
    }
}

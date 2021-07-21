package 백준.기본수학1.설탕배달_2839;

import java.util.Scanner;

/*
* 문제: 상근이가 N킬로그램의 설탕을 배달해야 할 때, 최소의 봉지 갯수를 구하시오.
* 조건: 봉지는 5KG,3KG이 있다. 만약 정확하게 N 킬로그램을 만들 수 없으면 -1을 출력한다. (3<=N<=5000)
* 입력: N: 배달해야 하는 킬로그램
* 출력: 최소 봉지 갯수
* 알고리즘
* */
public class 설탕배달_2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


        if (N == 4 || N == 7) {
            System.out.println(-1);
        }
        else if (N % 5 == 0) {
            System.out.println(N / 5);
        }
        else if (N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) {
            System.out.println((N / 5) + 2);
        }
    }
}

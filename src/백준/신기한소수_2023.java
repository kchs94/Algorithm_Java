package 백준;

import java.util.Scanner;

/*
* N자리 수 중에서 신기한 소수를 오름차순으로 정렬해서 한 줄에 하나씩 출력해라.
* 신기한 수란 왼쪽부터 1자리, 2자리, ..., N자리 수 모두 소수인 수를 의미한다.
*
* dfs을 이용하여 숫자를 오른쪽에 붙여나가다가 N자리 수가되면 출력
*
* */
public class 신기한소수_2023 {
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        dfs("2");
        dfs("3");
        dfs("5");
        dfs("7");

        System.out.println(sb);
    }

    public static void dfs(String num) {
        if (!isPrime(Integer.parseInt(num)))
            return;

        if (num.length() == N) {
            if (isPrime(Integer.parseInt(num)))
                sb.append(num).append("\n");
        } else {
            for (int i=1; i<=9; i+=2) {
                dfs(num + i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i=2; i<=(int)Math.sqrt(num); i++) {
            if (num%i == 0)
                return false;
        }

        return true;
    }
}

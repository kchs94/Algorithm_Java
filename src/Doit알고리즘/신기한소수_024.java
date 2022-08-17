package Doit알고리즘;

//import java.util.Scanner;

import java.util.Scanner;

/*
* 시간제한: 2초
* 데이터 크기: 8
*
* DFS 문제
* - N을 입력받는다.
* - N자리 수 신기한 소수를 모두 찾아 오름차순으로 출력한다.
* - 신기한 소수: 왼쪽부터 1자리, 2자리 ,.... N자리 수 모두 소수인 수
* DFS를 이용하는 문제다.
* */
public class 신기한소수_024 {

    static StringBuilder sb = new StringBuilder();
    static int N;

    public static boolean isPrime(int num) {
        if (num<=1) return false;

        for (int i=2; i<=(int)Math.sqrt(num); i++) {
            if (num%i == 0)
                return false;
        }
        return true;
    }

    public static void dfs(String str) {
        if (!isPrime(Integer.parseInt(str))) return;

        if (str.length() == N) {
            sb.append(str + "\n");
            return;
        }
        else {
            for (int i=0; i<=9; i++) {
                dfs(str + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        for (int i=0; i<=9; i++) {
            dfs(String.valueOf(i));
        }

        System.out.println(sb.toString());
    }
}

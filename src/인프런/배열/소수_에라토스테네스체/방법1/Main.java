package 인프런.배열.소수_에라토스테네스체.방법1;

/*
 * N을 입력하면 1부터 N까지 수 중 소수의 갯수를 출력하는 문제
 *
 *
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int solution(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        int count = 0;
        isPrime[0] = false;
        isPrime[1] = false;


        for (int i=2; i<=n; i++) {
            if (isPrime[i]) {
                count++;
                for (int j = i*2; j<=n; j = j+i) {
                    isPrime[j] = false;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}
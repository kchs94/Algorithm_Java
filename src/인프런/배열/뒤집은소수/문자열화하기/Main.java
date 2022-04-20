package 인프런.배열.뒤집은소수.문자열화하기;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        for (Integer x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> primeList = new ArrayList<>();

        for (int x : arr) {
            // 숫자 뒤집기(1.나머지연산, 2.문자열화, ..)
            int num = reverseNum(x);
            // 소수인지 판별하기
            if (isPrime(num))
                primeList.add(num);
        }
        return primeList;
    }

    public static int reverseNum(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();
        return Integer.parseInt(sb.toString());
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num%i == 0) return false;
        }
        return true;
    }
}
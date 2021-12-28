package 인프런.배열.뒤집은소수.방법1;

import java.util.ArrayList;
import java.util.Scanner;
/*
* 다시 풀어보기
* 숫자를 뒤집는 알고리즘 기억하기
* 소수 판별하는 알고리즘 기억하기
* */
public class Main {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int reverse = 0;

            while(arr[i] != 0) {
                int digit = arr[i] % 10;    // 일의 자리수 얻기
                reverse = 10 * reverse + digit; // 뒤집은 값 구하기
                arr[i] /=10;    // 일의 자리 수 제거하기
            }

            if(isPrime(reverse)) {
                list.add(reverse);
            }

        }
        return list;
    }

    public boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {    // 약수가 발견되면
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = in.nextInt();
        }

        for(Integer integer : T.solution(num, arr)) {
            System.out.print(integer + " ");
        }
    }
}

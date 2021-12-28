package 인프런.배열.피보나치수열.내방법;

import java.util.Scanner;

public class Main {

    public int[] solution(int n) {
        int[] arr = new int[n]; // 길이 n인 배열 선언
        arr[0] = 1; // 초기값 설정
        arr[1] = 1;

        for(int i=2; i<n; i++) {    // 2개의 원소값은 설정해줬으니 나머지 원소값 설정하기
            arr[i] = arr[i-2] + arr[i-1];   // 원소값은 앞 2개의 원소 합
        }

        return arr;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(Integer integer : T.solution(num)) {
            System.out.print(integer + " ");
        }
    }
}

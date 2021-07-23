package 백준.기본수학2.소수찾기_1978;

import java.util.Scanner;

/*
* 문제: 주어진 수 N개 중에서 소수가 몇 개인지 출력하시오.
* 입력: 1<=N<=100
* 출력: 소수의 갯수
* 소수: 2이상 수 중에서 1~자기자신 범위에서 1과 자기 자신외 수로 나누어 지지 않는 수이다.
* 알고리즘
* 1. 수 N을 입력받는다.
* 2. N번 반복하여 입력받은 각 문자마다 소수인지 판별한다.
* 2-1. 입력받은 숫자를 2부터 입력받은 숫자-1까지 반복하여 나머지 연산을 해  결과값이 0이되는게 있으면 소수가 아니고 없으면 소수이다.
* 3. 소수이면 count를 1 증가한다.
* 4. 출력한다.
* */
public class 소수찾기_1978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // 입력받을 숫자 갯수
        int[] arr = new int[N]; // 입력받는 숫자를 저장할 배열
        int count=0;

        for(int i=0; i<N; i++){

            arr[i] = in.nextInt();
            if(isPrime(arr[i]))
                count++;
        }

        System.out.println(count);
    }

    // 소수 판별 메소드
    public static boolean isPrime(int N){
        if(N <2) return false;  // 0, 1
        else if(N == 2) return true;    // 2
        else{   // 3 이상

            for(int i=2; i<N; i++){

                if(N%i == 0) return false;
            }

            return true;
        }
    }
}

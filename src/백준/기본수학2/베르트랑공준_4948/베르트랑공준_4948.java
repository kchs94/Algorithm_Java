package 백준.기본수학2.베르트랑공준_4948;

import java.util.Scanner;

/*
* 문제: 자연수 n에 입력으로 들어왔을 때, (n,2n] 범위안에 있는 소수의 갯수를 출력하세요.
* 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있고, 0을 입력하면 프로그램을 종료한다.
* 출력: 각 테스트 케이스 마다, (n, 2n] 범위안에 있는 소수의 갯수를 출력한다.
* 배운점: 특정 범위 안에있는 소수의 갯수를 구할 수 있는가?
* 알고리즘: 수학2
* 1. n을 정수형으로 입력받는다.
* 2. (n,2n]의 소수의 갯수를 카운트 한다.
* 3. 카운트한 소수의 갯수를 출력한다.
* 4. 0이 입력할 때까지 무한반복한다.
* 첫 번째 제출: X(문제: 시간초과)
* 두 번째 제출: O(해결방법: Math.sqrt(n)을 포함한 범위까지만 나누어본다.
* */
public class 베르트랑공준_4948 {
    public static void main(String[] args) {

        // 입력
        Scanner in = new Scanner(System.in);

        // 알고리즘
        while(true){

            int count=0;
            int n = in.nextInt();
            if(n == 0) break;   // n이 0이면 종료

            for(int i=n+1; i<=2*n; i++){
                if(isPrime(i))  // 소수 판별
                    count++;
            }
            
            // 출력
            System.out.println(count);

        }
    }


    // 소수 판별 메소드
    public static boolean isPrime(int n){
        if(n<=1)
            return false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i ==0)
                return false;
        }
        return true;
    }
}

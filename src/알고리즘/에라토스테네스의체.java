package 알고리즘;

import java.util.Scanner;

public class 에라토스테네스의체 {
    public static boolean[] prime = new boolean[10001]; // 인덱스를 소수 판별할 숫자로 인식

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        make_prime(N);

        for(int i=0; i < prime.length; i++){
            if(prime[i] == false){  // 소수(false)일 경우 출력
                System.out.println(i);
            }
        }
    }

    // N 이하의 소수 생성 메소드
    public static void make_prime(int N){

        prime = new boolean[N+1];   // 0~N

        /*
         * 소수(false)
         * 소수X(true)
         * */

        // 2미만의 N을 입력받으면 소수는 판별할 필요가 없으므로 바로 ruturn
        if(N < 2){
            return;
        }

        prime[0] = prime[1] = true;

        // 제곱근 함수 : Math.sqrt()
        for(int i=2; i<=Math.sqrt(N); i++){

            // 이미 체크된 배열이라면 다음 반복문으로 스킵
            if(prime[i] == true){
                continue;
            }

            // i의 2이상의 배수들을 걸러주기 위한 반복문
            for(int j = i*i; j<prime.length; j = j+i){
                prime[j] = true;
            }
        }
    }
}

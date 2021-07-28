package 알고리즘;

import java.util.Scanner;

public class 소수판별메소드 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if(isPrime(in.nextInt()))
            System.out.println("소수입니다.");
        else
            System.out.println("소수가 아닙니다.");


    }

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


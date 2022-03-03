package 백준.단계별문제풀이.기본수학2.소수_2581;

import java.util.Scanner;

/*
* 문제: 자연수 M과 N이 주어질 때, M이상 N이하 자연수 중 소수인 것을 모두 골라 최솟값과 총 합을 구하세요.
* 입력: 첫째 줄에 M, 둘째 줄에 N (1<=M <= N<=10,000)
* */
public class 소수_2581 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        in.close();
        int min, sum;

        // 알고리즘
        min = min(M,N);
        sum = sum(M,N);
        
        if(sum ==0) System.out.println(min);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static int min(int M, int N){
        int min=0;

        for(int i=M; i<=N; i++){

            if(makePrime(i) !=0){
                min = makePrime(i);
                return min;
            }
        }

        return -1;
    }

    public static int makePrime(int N){

        if(N <2) return 0;

        if(N == 2) return 2;

        for(int i=2; i<N; i++){
            if(N%i == 0) return 0;
        }
        return N;
    }

    public static int sum(int M, int N){
        int sum=0;
        for(int i=M; i<=N; i++){
            sum += makePrime(i);
        }

        return sum;
    }
}

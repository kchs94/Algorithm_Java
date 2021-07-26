package 백준.재귀.피보나치수_10870;

import java.util.Scanner;

/*
* 문제: 파보나치 f(0) = 0, f(1)=1, f(n)= f(n-1) + f(n-2) (2<=n)
* 입력: 0<= n<=20
* 출력: n번째 피보나치 수 출력
*
* */
public class 피보나치수_10870 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int answer;

        answer = getFibo(N);

        System.out.println(answer);
    }
    public static int getFibo(int N){
        if(N == 0) return 0;    // 1 번째
        else if(N == 1) return 1;   //2 번재
        else{   // N 번째
            return getFibo(N-1) + getFibo(N-2);
        }
    }
}

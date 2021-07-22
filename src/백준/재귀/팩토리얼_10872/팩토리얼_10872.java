package 백준.재귀.팩토리얼_10872;
// 재귀: f 함수 안에서 f함수를 호출하는 형태.
import java.util.Scanner;
/*
* 문제: N!을 출력하는 프로그램을 작성하세요
* 입력: 0<=N<12
* 출력: N!
* */
public class 팩토리얼_10872 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        
        //알고리즘
        int answer = factorial(N);
        
        // 출력        
        System.out.print(answer);
    }

    // 팩토리얼
    public static int factorial(int N){
        if(N <= 1) return 1;
        return N * factorial(N-1);
    }
}

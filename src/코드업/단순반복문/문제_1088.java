package 코드업.단순반복문;

import java.util.Scanner;

/*
* 1.정수 N을 입력받는다.
* 2.1~N까지 출력한다.
* 3.만약 숫자가 3의 배수이면 출력하지 않는다.
*
* */
public class 문제_1088 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 입력 준비
        int N = in.nextInt();

        for(int i=1; i<=N; i++){
            if(i%3 == 0) continue;  // 나머지가 0 이면 배수이다.
            System.out.print(i +" ");
        }
    }
}

package 백준.문자열.상수;

import java.util.Scanner;

public class 상수_2908_2 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        in.close();

        //알고리즘: StringBuffer의 reverse() 이용하기
        A = Integer.parseInt(new StringBuffer().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuffer().append(B).reverse().toString());

        // 출력: 삼항 연산자 사용하기
        System.out.println( A>B ? A : B );
    }
}

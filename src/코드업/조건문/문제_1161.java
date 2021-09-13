package 코드업.조건문;

import java.util.Scanner;

public class 문제_1161 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();   // 입력은 정수 2개 밖에 안되니깐 Scanner로 입력받기
        int B = in.nextInt();
        StringBuilder sb = new StringBuilder(); // 문자열을 붙일 계획

        if(A%2 == 0) sb.append("짝수+");  // 나머지 연산을 이용해서 짝수, 홀수 구분하기
        else sb.append("홀수+");

        if(B%2 == 0) sb.append("짝수=");
        else sb.append("홀수=");

        if((A+B)%2 == 0 ) sb.append("짝수");
        else sb.append("홀수");

        System.out.println(sb); // 객체를 입력으로 넣어주면 자동으로 toString 메소드가 호출된다.
    }
}

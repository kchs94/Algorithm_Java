package 코드업.단순반복문;

import java.util.Scanner;

/*
* 반복문을 이해하고 있는가?
* 아스키 코드를 이해하고 있는가?
* */
public class 문제_1076 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 입력 클래스를 생성하고 인자로 키보드를 넣어준다
        char ch = in.next().charAt(0);
        StringBuilder sb = new StringBuilder();

        for(int i= 'a'; i<=ch; i++ ){
            sb.append((char)i + " ");
        }
        System.out.println(sb);
    }
}

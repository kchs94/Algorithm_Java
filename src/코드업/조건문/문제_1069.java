package 코드업.조건문;
// 출제의도: Switch를 이용하여 입력값에 따라 출력값을 다르게 할 수 있나요?


import java.util.Scanner;

public class 문제_1069 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);  // Scanner은 char를 직접적으로 받는 방법이 없습니다.

        switch(ch){ // 정수값 문자는 아스키코드가 있어서 가능하다.
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
}

package 코드업.함수;

public class 문제_1533 {
    private static float f(){
        return 3.14f;   // 자바는 기본적으로 소수를 double로 저장하므로 f를 붙여준다.
    }
    public static void main(String[] args) {
        System.out.printf("%.6f", f()); // 소수점 아래 0을 표현하기 위해 printf
    }
}

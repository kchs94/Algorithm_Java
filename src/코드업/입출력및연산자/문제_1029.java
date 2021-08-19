package 코드업.입출력및연산자;
/*
* Stirng.format()은 소수점 아래 0을 절삭하지 않는다.
* Math.round()는 소수점 아래 0을 절삭한다.
* */
import java.util.Scanner;

public class 문제_1029 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println(String.format("%.11f", number));
    }
}

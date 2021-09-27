package 코드업.단순반복문;

/*
* 문제: 시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력되었을 때 n번째 수를 출력하는 프로그램을 작성해라
*
* 수도코드
* 시작 값 a과 등차 d 그리고 몇 번째 수인지를 나타내는 n을 입력받는다.
* 일반항을 구한다. a(n) = a + (n-1)*d
* 일반항에 n을 대입하여 n번째 수를 출력한다.
* */

import java.util.Scanner;

public class 문제_1089 {
    public static void main(String[] args) {
        // 시작 값 a과 등차 d 그리고 몇 번째 수인지를 나타내는 n을 입력받는다.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int d = in.nextInt();
        int n = in.nextInt();

        // 일반항을 구한다. a(n) = a + (n-1)*d
        int valueOfN = a + (n-1)*d;

        // 일반항에 n을 대입하여 n번째 수를 출력한다.
        System.out.println(valueOfN);
    }
}

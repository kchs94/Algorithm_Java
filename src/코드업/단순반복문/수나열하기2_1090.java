package 코드업.단순반복문;

import java.util.Scanner;

// 시작 값 a, 등비 r, 몇 번째인지를 나타내는 정수 n이 입력될 때 n번째 수를 출력하는 프로그램을 작성해라.
// 21억을 넘어갈 경우 long을 사용하자.

public class 수나열하기2_1090 {
    public static void main(String[] args) {
        // 시작 값 a 등비 r 순서 n을 입력받는다.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int r = in.nextInt();
        int n = in.nextInt();

        // 등비수열 공식: a(n) = a*r^(n-1)을 이용하여 n번째 수를 저장한다.
        long valueofNOrder = a*(long)Math.pow(r, n-1);

        // n번째 수를 출력한다.
        System.out.println(valueofNOrder);
    }
}

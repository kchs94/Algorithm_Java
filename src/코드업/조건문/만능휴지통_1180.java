package 코드업.조건문;

import java.util.Scanner;

/** 특정 알고리즘을 이용해 n만큼 차면 알아서 쓰레기통을 압축해주는 휴지통 프로그램
*
* 수도코드
* 휴지통 압축 기준 n을 입력(1<=n<=99)
*
* 입력된 값의 십의 자리와 일의 자리를 바꾼다.
* 거기에 2를 곱한다.
*
* if 100 < 휴지통 양
*   백의 자릿수는 무시한다.
*
* 휴지통 압축 양을 출력한다.
* if 휴지통 양 <= 50 then
*   "GOOD"을 출력한다.
* else if
*   "OH MY GOD"을 출력한다.
* endif
* */
public class 만능휴지통_1180 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        n = ((n/10) + (n%10)*10)*2;


        if(100 < n)
            n = n%100;
        System.out.println(n);
        if(n <= 50)
            System.out.println("GOOD");
        else
            System.out.println("OH MY GOD");

    }
}

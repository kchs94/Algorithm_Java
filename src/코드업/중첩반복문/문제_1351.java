package 코드업.중첩반복문;

import java.util.Scanner;

/*
* 중첩반복문을 사용할 수 있나요?
*
* */
public class 문제_1351 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fromNum = in.nextInt();
        int toNum = in.nextInt();

        for(int i=fromNum; i<=toNum; i++){
            for(int j=1; j<=9; j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}

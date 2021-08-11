package 코드업.조건문;

import java.util.Scanner;

public class 문제_1067 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int N = in.nextInt();

            if(0<N){    // 양수

                System.out.println("plus");

                if(N%2 == 0){   // 짝수
                    System.out.println("even");
                } else {        // 홀수
                    System.out.println("odd");
                }
            } else{     // 음수

                System.out.println("minus");

                if(N%2 == 0){   // 짝수
                    System.out.println("even");
                } else {        // 홀수
                    System.out.println("odd");
                }
            }
    }
}

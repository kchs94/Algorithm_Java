package 코드업.입출력및연산자;

import java.util.Scanner;

public class 문제_1042 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        // 알고리즘
        int quotient = A/B; 
        
        //출력
        System.out.print(quotient);
    }
}

package 코드업.중첩반복문;

import java.util.Scanner;

public class 문제_1081 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        for(int i=1; i<=A; i++){

            for(int j=1; j<=B; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}

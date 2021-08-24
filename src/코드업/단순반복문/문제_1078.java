package 코드업.단순반복문;

import java.util.Scanner;

public class 문제_1078 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int sum=0;
        for(int i=2; i<=number; i=i+2){
            sum +=i;
        }
        System.out.print(sum);
    }
}

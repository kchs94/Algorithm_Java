package 코드업.단순반복문;

import java.util.Scanner;

public class 문제_1080 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum=0;

        for(int i=0; i<=num; i++){
            sum +=i;
            if(num <= sum){
                System.out.printf("%d",i);
                break;
            }
        }
    }
}

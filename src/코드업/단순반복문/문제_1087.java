package 코드업.단순반복문;

import java.util.Scanner;

public class 문제_1087 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum=0;
        int i=1;

        while(sum < num){
            sum +=i;
            i++;
        }
        System.out.println(sum);
    }
}

package 코드업.단순반복문;

import java.util.Scanner;

public class 문제_1073 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        while(true){
            n = in.nextInt();
            if(n == 0) break;
            System.out.println(n);
        }
    }
}

package 코드업.조건문;

import java.util.Scanner;

public class 문제_1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];

        for(int i=0; i<3; i++){
            a[i] = in.nextInt();
        }

        for(int item : a){
            if(item%2 ==0) System.out.println(item);
        }

    }
}

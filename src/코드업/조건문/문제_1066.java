package 코드업.조건문;

import java.util.Scanner;

public class 문제_1066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
            if(arr[i]%2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
        in.close();
    }
}

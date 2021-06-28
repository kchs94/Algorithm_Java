package 백준.for문;

import java.util.Scanner;

public class 합_8393 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        in.close();

        int sum=0;  // 합을 담을 변수
        for(int i=1; i<=n; i++)
            sum +=i;

        System.out.println(sum);

    }
}

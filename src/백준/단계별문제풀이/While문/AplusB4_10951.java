package 백준.단계별문제풀이.While문;

import java.util.Scanner;

public class AplusB4_10951 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A;
        int B;

        while(in.hasNextInt()){ // hasNextInt(): 값이 있으면 true를 입력 값이 더 이상 존재하지 않으면 예외를 던진다.

            A = in.nextInt();
            B = in.nextInt();
            System.out.println(A+B);
        }
        in.close();
    }
}

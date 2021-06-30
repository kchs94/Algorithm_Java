package 백준.While문;

import java.util.Scanner;

public class 더하기싸이클_1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length=1;       // N 싸이클 길이
        int N=in.nextInt();
        in.close();
        int first=N;    //첫 입력 값

        while(true){    // 첫 입력 값과 같을 때 까지
            N = (N%10)*10 + ((N/10)+(N%10))%10; // 새로운 수 : '첫째 자리수*10 + 각 자리 수 합 % 10'를 구하고
            if(N == first)  // 첫 입력 값과 같은지 확인 후 같으면 반복 멈춤
                break;
            length++;   // 같지 않으면 길이 증가
        }

        System.out.println(length);
    }
}

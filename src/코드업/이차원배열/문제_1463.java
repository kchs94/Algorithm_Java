package 코드업.이차원배열;

import java.util.Scanner;

public class 문제_1463 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<number; i++){    // 4번 반복
            for(int j=1; j<=number; j++){   // 4번 반복
                sb.append(number*j -i + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

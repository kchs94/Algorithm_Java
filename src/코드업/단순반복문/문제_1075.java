package 코드업.단순반복문;

import java.util.Scanner;

/*
* 출제의도: for을 사용할 수 있는가?
* */
public class 문제_1075 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n; i++){
            sb.append(n-i + "\n");
        }
        System.out.println(sb);
    }
}

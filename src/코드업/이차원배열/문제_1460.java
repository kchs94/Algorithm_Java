package 코드업.이차원배열;
/*
* 의도: 배열을 잘 활용 할 수 있는가?
* */
import java.util.Scanner;

public class 문제_1460 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n*n; i++){
            sb.append(i + " ");
            if(i%n == 0) sb.append("\n");
        }
        System.out.println(sb);
    }
}

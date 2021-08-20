package 코드업.이차원배열;
import java.util.Scanner;

/*
*
* */
public class 문제_1461 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=num; i++){
            for(int j=0; j<num; j++){
                sb.append(num*i - j + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

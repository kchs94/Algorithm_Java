package 코드업.중첩반복문;
// 반복문을 사용 할 줄 아는가?
import java.util.Scanner;

public class 문제_1352 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   // 길이 n인 사각형
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n ; i++){
            for(int j =0; j<n; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

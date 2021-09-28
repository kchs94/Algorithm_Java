package 코드업.중첩반복문;

import java.util.Scanner;

// 수도코드
// 평행사변형 높이 n을 입력받는다(2<=n<=99)
// for i=1 to n  do {
//      for j=1 to n-i do
//              공백" "을 추가한다
//      별을 n개 붙인다
//      개행을 붙인다.
//  }
public class 평행사변형_1367 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // 평행사변형 높이 n을 입력받는다(2<=n<=99)
        int n = in.nextInt();

        // for i=1 to n  do {
        for(int i=1; i<=n; i++){

            //  for j=1 to n-i do
            for(int j=1; j<=n-i; j++)
                sb.append(" ");  // 공백" "을 추가한다
            for(int k=1; k<=n; k++)
                sb.append("*");  //      별을 n개 붙인다
            sb.append("\n"); //      개행을 붙인다.
        }

        System.out.println(sb);
    }
}

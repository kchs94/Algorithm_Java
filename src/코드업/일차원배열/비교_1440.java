package 코드업.일차원배열;

import java.util.Scanner;

// 숫자의 갯수 n을 입력받는다
// n개의 숫자를 공백으로 구분하여 입력받는다.
// FOR i=0 to n-1 do {
//      "i+1: "을 표시한다.
//      FOR j=0 to n-1 do {
//          IF (i와j가 같으면)
//              패스한다.
//          ELSE (다르면) {
//              IF(i번째값 < j번째값)
//                  "< " 부등호를 표시한다
//              ELSE IF (i번째값 > j번째값)
//                  "> " 부등호를 표시한다
//              ELSE
//                  "= " 등호를 표시한다.
//          }
//          개행한다.
//      }
// }
// 비교 결과를 출력한다.
public class 비교_1440 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            sb.append((i+1)+ ": ");

            for(int j=0; j<n; j++){

                if(i == j) continue;
                else{

                    if(arr[i] < arr[j]) sb.append("< ");
                    else if(arr[i] > arr[j]) sb.append("> ");
                    else sb.append("= ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

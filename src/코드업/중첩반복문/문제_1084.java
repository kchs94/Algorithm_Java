package 코드업.중첩반복문;
// Scanner와 System.out.print를 사용하면 메모리 초과가 난다.
// 출력에있어 속도는 StringBuilder 메모리는 BufferedWriter가 좋다.

import java.io.*;

public class 문제_1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for(int i=0; i<Integer.parseInt(arr[0]); i++){
            for(int j=0; j<Integer.parseInt(arr[1]); j++){
                for(int k=0; k<Integer.parseInt(arr[2]); k++){
                    bw.write(i + " " + j + " " + k + '\n');
                }
            }
        }

        bw.flush();
        System.out.println(Integer.parseInt(arr[0])*Integer.parseInt(arr[1])*Integer.parseInt(arr[2]));
    }
}

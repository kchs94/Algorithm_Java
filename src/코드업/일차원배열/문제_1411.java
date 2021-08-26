package 코드업.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제_1411 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[size+1];  // n번 카드가 있으면 n번 인덱스값이 참이 된다.

        for(int i=0; i<size-1; i++){
            arr[Integer.parseInt(br.readLine())] = true;
        }

        for(int i=1; i<=size; i++){
            if(arr[i] == false){
                System.out.println(i);
                break;
            }
        }
    }
}

package 백준.정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 문제_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];
        StringTokenizer st = new StringTokenizer(br.readLine());


        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 1;
        if(length == 1)
            System.out.println(arr[0]*arr[0]);
        else{
            for(int i=0; i<length; i++){
                result = result*arr[i];
            }
            System.out.println(result);
        }
    }
}

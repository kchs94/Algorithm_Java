package 코드업.함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 문제_1535 {


    private static int f(int[] arr){
        int index=0;
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                index = i;
                max = arr[i];
            }
        }


        return index+1;
    }

    public static void main(String[] args) throws IOException {
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];


        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        System.out.println(f(arr));
    }
}

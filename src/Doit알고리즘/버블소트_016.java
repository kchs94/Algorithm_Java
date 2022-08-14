package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* 나중에 다시 풀기
*
* */
public class 버블소트_016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];


        for (int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        boolean changed = false;
        for (int i=1; i<=N+1; i++) {
            changed = false;
            for (int j=1; j<=N-1; j++) {
                if (arr[j] > arr[j+1]) {
                    changed = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (changed == false) {
                System.out.println(i);
                break;
            }
        }
    }
}

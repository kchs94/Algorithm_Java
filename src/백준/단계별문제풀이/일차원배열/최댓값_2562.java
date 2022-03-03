package 백준.단계별문제풀이.일차원배열;

import java.util.Scanner;

public class 최댓값_2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int order = 0;

        for(int i=0; i<9; i++){
            arr[i] = in.nextInt();
            if(arr[i] > max){
                max = arr[i];
                order = i+1;
            }
        }

        System.out.println(max);
        System.out.println(order);
    }
}

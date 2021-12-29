package 인프런.배열.등수구하기.방법１;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        int[] result = new int[n];

        for(int i=0; i<n; i++) {
            int count = 1;

            for(int j=0; j<n; j++ ) {

                if(arr[i] < arr[j]) {
                    count++;
                }

            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}

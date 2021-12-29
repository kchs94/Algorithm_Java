package 인프런.배열.점수계산.방법1;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr) {
        int total = 0;
        int count = 0;

        for(int i=0; i<n; i++) {

            if(arr[i] == 0) {   // 틀렸으면
                count = 0;
            }
            else {  // 맞췄으면
                count++;
                total += count;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}

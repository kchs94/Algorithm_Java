package 인프런.정렬과검색.선택정렬.방법1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        Arrays.sort(arr);
        return arr;
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

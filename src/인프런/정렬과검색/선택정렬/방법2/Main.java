package 인프런.정렬과검색.선택정렬.방법2;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        for (int i=0; i<n-1; i++) {
            int index = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[index])
                    index = j;  // 가장 작은 숫자의 인덱스 번호가 저장된다.
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

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

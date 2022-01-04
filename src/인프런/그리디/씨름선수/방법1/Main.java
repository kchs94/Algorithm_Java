package 인프런.그리디.씨름선수.방법1;

import java.util.Scanner;

public class Main {

    static int total;

    public int solution(int n, int[][] arr) {

        for(int i=0; i<n; i++) {

            for(int j=0; j<n; j++) {

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    total--;
                    break;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        total = n;
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}

package 인프런.배열.임시반장정하기.방법1;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++) {   // i: 학생번호
            int count = 0;
            for(int j=1; j<=n; j++) {   // j: 비교학생번호

                for(int k=1; k<=5; k++) {   // k: 학년

                    if(arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if(count > max) {
                max = count;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1; i<=n; i++) {   // i:학생번호
            for(int j=1; j<=5; j++) {   // j: 학년
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}

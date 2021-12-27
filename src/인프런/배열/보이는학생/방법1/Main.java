package 인프런.배열.보이는학생.방법1;

import java.util.Scanner;

public class Main {
    public int solution(int num, int[] arr) {
        int max = arr[0];
        int count = 1;

        for(int i=1; i<num; i++) {

            if( arr[i] > max) { // 지금까지 최대 큰 학생보다 더 크다면
                count++;
                max = arr[i];   // 그 학생을 최대 값으로 변경
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(num, arr));
    }
}

package 코드업.일차원배열;

import java.util.Scanner;

public class 문제_1093 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();   // 부른 횟수
        int[] id = new int[23];  // 각 학생별로 부른 횟수를 저장할 배열 생성


        for(int i=0; i<count; i++){ // 부른 횟수만큼 입력
            id[in.nextInt()-1]++;
        }

        for(int i=0; i<23; i++){    // 전체 학생 별 부른 횟수 출력
            System.out.print(id[i] + " ");
        }

    }
}

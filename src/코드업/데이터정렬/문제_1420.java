package 코드업.데이터정렬;

import java.util.Scanner;

/*
*
* 1. 테스트 케이스 T를 입력받습니다.
* 2. T번 이름과 성적을 공백으로 분리하여 입력받아 String[], int[]에 저장합니다.
* 3. 정렬합니다.
* 4. 성적이 3등인 친구의 이름을 출력합니다.
*
* */
public class 문제_1420 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();   // 테스트 케이스
        String[] name = new String[T];  // 이름
        String tmp2;    // 임시 변수
        int tmp1;       // 임시 변수
        int[] grade = new int[T];     // 성적

        // 입력
        for(int i=0; i<T; i++){
            name[i] = in.next();
            grade[i] = in.nextInt();
        }

        // 정렬
        for(int i=0; i<T-1; i++){
            for(int j=i+1; j<T; j++){
                if(grade[i] < grade[j]){
                    tmp1 = grade[i];
                    grade[i] = grade[j];
                    grade[j] = tmp1;

                    tmp2 = name[i];
                    name[i] = name[j];
                    name[j] = tmp2;
                }
            }
        }


        // 출력
        System.out.println(name[2]);
    }
}

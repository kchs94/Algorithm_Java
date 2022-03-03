package 백준.단계별문제풀이.일차원배열;

import java.util.Scanner;

public class 평균은넘겠지_4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr;
        int T = in.nextInt();   // t: 테스트 케이스 갯수

        for(int i=0; i<T; i++){
            int N = in.nextInt();   // N: 학생 수
            arr = new int[N];
            double sum=0;   // sum: 누적 성적 합

            // 성적 입력
            for(int j=0; j<N; j++){
                int val = in.nextInt(); //성적 입력
                arr[j] = val;
                sum += val; // 성적 누적 합
            }
            
            double mean = (sum/N);
            double count =0;    // 평균 넘는 학생 수

            // 평균 넘는 학생 비율 찾기
            for(int j=0; j<N; j++){
                if(arr[j] > mean)
                    count++;
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
        in.close();
    }
}

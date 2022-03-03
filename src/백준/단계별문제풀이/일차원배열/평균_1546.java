package 백준.단계별문제풀이.일차원배열;

import java.util.Scanner;

public class 평균_1546 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();   // 과목 갯수
        double[] arr = new double[N];   // 과목 점수
        double max=0;   // 과목 중 최대 점수
        double avg=0;   // 평균

        for(int i=0; i<N; i++){     // N개 입력 받기
            arr[i] = in.nextDouble();
        }
        in.close();

        max = arr[0];
        for(int i=0; i<N; i++){     // max값 선정하기
            if(max < arr[i])
                max = arr[i];
        }

        double sum=0;   // 과목 점수 총 합
        for(int i=0; i<N; i++){     //점수 조작하기
            arr[i] = arr[i] / max * 100;
            sum += arr[i];          // 점수 총 합
        }

        avg = sum / arr.length;     // 평균: 점수 총 합 / 과목 갯수
        System.out.println(avg);
    }
}

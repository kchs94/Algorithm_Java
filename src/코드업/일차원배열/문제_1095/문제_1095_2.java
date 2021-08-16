package 코드업.일차원배열.문제_1095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 첫 번재 원소를 최솟값으로 설정하여 for으로 배열 최솟값 찾기
public class 문제_1095_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // 부른 횟수
        int[] attendanceNum = new int[n];   // 불려진 출석번호

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            attendanceNum[i] = Integer.parseInt(st.nextToken());
        }

        int min = attendanceNum[0]; // 첫 번째 원소를 최솟값으로 설정

        for(int i=0; i<n; i++){
            if(attendanceNum[i] < min) min = attendanceNum[i];
        }

        System.out.println(min);   // 최솟값
    }
}

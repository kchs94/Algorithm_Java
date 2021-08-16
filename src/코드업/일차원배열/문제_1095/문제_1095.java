package 코드업.일차원배열.문제_1095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
/*
* 의사코드
* 1.첫째 줄에 번호를 부른 횟수 n을 입력받는다.
* 2.길이가 n인 배열을 생성합니다.
* 3.n개의 랜덤 번호를 두 번째 줄에 공백을 사이에 두고 입력합니다.
* 4.배열의 최솟값을 찾아 리턴합니다.
* 5.최솟값 알고리즘은 Arrays.sort를 이용합니다.
* */
public class 문제_1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // 부른 횟수
        int[] attendanceNum = new int[n];   // 불려진 출석번호

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            attendanceNum[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(attendanceNum); // 오름차순 정렬
        
        System.out.println(attendanceNum[0]);   // 최솟값

    }
}

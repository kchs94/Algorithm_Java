package 백준.그리디;

import java.io.*;
import java.util.*;
/*
* 상식상식
* numOfPerson
* spendedTime 배열 선언
* 소모되는 시간의 최솟값 구하기
* 1. 우선 오름차순 정렬
* 2. 최솟값 담을 변수 선언
* 3. N명 일경우 첫째원소*N + 둘째원소*N-1 + ... + 마지막원소*1이런식
*
* */

public class ATM_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력 준비
        StringBuilder sb = new StringBuilder(); // 출력 준비
        StringTokenizer st; // 문자열 쪼개기 준비

        int numOfPerson = Integer.parseInt(br.readLine());  // 사람 수 입력
        int[] spentTime = new int[numOfPerson];
        st = new StringTokenizer(br.readLine());
        
        // 사용하는 시간 입력
        for(int i=0; i<numOfPerson; i++){
            spentTime[i] = Integer.parseInt(st.nextToken());
        }

        int minOfTime=0;   // 최소 시간의 합
        // 알고리즘

        Arrays.sort(spentTime); // 오름차순으로 정렬

        for(int i=0; i<numOfPerson; i++){
            minOfTime += spentTime[i]*(numOfPerson-i);  // 걸린시간*반복횟수
        }
        
        // 출력
        sb.append(minOfTime);
        System.out.println(sb); 
    }
}

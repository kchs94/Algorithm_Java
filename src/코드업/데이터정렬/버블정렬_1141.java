package 코드업.데이터정렬;

import java.util.Scanner;

/*
* 버블정렬: 인접하는 두 개의 원소를 비교하여 정렬하는 방법
* 비교 정렬 중 하나.
* 방법(오름차순 기준)
* 1. 앞에서부터 현재 원소와 바로 그 다음의 원소를 비교한다.
* 2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
* 3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
*
* */
public class 버블정렬_1141 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // 배열의 크기
        int[] bubbleSort = new int[N];

        // 입력
        for(int i=0; i<N; i++){
            bubbleSort[i] = in.nextInt();
        }

        // Bubble Sort
        for(int i=1; i<=N-1; i++){   // 총 라운드 반복 횟수 : 배열의 크기 -1
            for(int j=0; j<N-i; j++){ // 각 라운드 별 비교 횟수: 배열의 크기 - 라운드 횟수
                if(bubbleSort[j] > bubbleSort[j+1]){
                    int temp = bubbleSort[j];
                    bubbleSort[j] = bubbleSort[j+1];
                    bubbleSort[j+1] = temp;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(bubbleSort[i]);
        }
    }
}

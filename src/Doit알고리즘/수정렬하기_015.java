package Doit알고리즘;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/2750
* 1.분석
* - 데이터 크기: 1,000
* - 제한시간: 1초
* - 자바에서는 Array.sort()가 정의되어 있지만, 데이터 크기가 작기 때문에 직접 Bubble Sort를 구현하여 문제를 풀어보기로 결정
*
* */
public class 수정렬하기_015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }


        bubbleSort(arr);

        for (Integer i : arr) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        for (int i=1; i<size; i++) {

            for (int j=0; j<size-i; j++) {
                if (arr[j] > arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

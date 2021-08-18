package 알고리즘.정렬;
/*
* 장점
* 1.추가적인 메모리 소비가 적다.
* 2.구현이 매우 쉽다.
* 3.안장정렬이 가능하다.
*
* 단점
* 1.다른 정렬 알고리즘에 비해 교환 과정이 많아 많은 시간을 소비한다.
*
* 시간복잡도
* O(N^2)
*
* 특징
* 사실상 거의 쓰이지 않은 알고리즘
*
* */
public class 버블정렬 {

    public static void bubble_sort(int[] a){
        bubble_sort(a, a.length);
    }

    private static void bubble_sort(int[] a, int size){

        // round는 배열크기 - 1만큼 반복한다.
        for(int i=1; i<size; i++){

            // 각 라운드별 반복 비교횟수는 배열크기 - 현재라운드만큼 반복한다.
            for(int j=0; j<size-i; j++){

                /*
                * 현재 원소가 다음 원소보다 크면
                * 서로 원소의 값을 바꾼다.
                * */
                if(a[j] > a[j+1]){
                    swap(a, j, j+1) ;
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = a[i];
    }
}

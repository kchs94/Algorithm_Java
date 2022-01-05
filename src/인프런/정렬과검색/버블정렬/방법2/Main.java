package 인프런.정렬과검색.버블정렬.방법2;

import java.util.Arrays;
import java.util.Scanner;
/*
* 버블정렬(=거품정렬): 두 개의 인접한 원소를 비교하여 정렬하는 방식
* 왜 버블인가 하니 정렬과정에서 원소의 이동이 마치 거품이 수면위로 올라가는 방식과 비슷해서 붙여진 이름
* 거품 정렬의 특징
* - 데이터를 비교하면서 찾기 때문에 비교 정렬이다.
* - 정렬의 대상이 되는 데이터 외에 추가적인 공간을 필요하지 않기 때문에 제자리 정렬(in-place sort)이다.
*   - 참고로 두 데이터의 값을 교환하는 과정(swap)에서 사용하는 임시 변수가 있으나, 이는 충분히 무시할만한 수준이기 때문에 제자리 정렬로 본다.
* - 앞에서부터 차례대로 데이터를 비교하기 때문에 '안정 정렬'이다.
* ------------과정---------
* <<오름차순기준>>
* 1.앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
* 2.현재 원소가 바로 앞 원소보다 크면 서로 값을 교환한다.
* 3.다음 원소로 이동하여 해당 원소와 그 다음 원소를 비교한다.
*
* 각 라운드를 진행할 때마다 뒤에서부터 한 개씩 원소가 정렬되기 때문에, 라운드가 진행될 때마다 비교 횟수가 하나씩 줄어든다.
* 총 라운드 횟수 : 배열 길이 - 1
* 각 라운드별 비교 횟수 : 배열 길이 - 라운드 횟수
* */
public class Main {

    public int[] bubble_sort(int size, int[] arr) {

        // round 횟수: 배열 길이 - 1
        for (int i=1; i<size; i++) {    // i : 라운드 값

            // 각 라운드별 비교횟수: 배열 길이 - 현재 라운드(i)
            for (int j=0; j<size - i; j++) {
                /*
                * 현재 원소가 다음 원소보다 값이 크면
                * 두 원소의 값을 교환한다.
                * */
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i : T.bubble_sort(n, arr)) {
            System.out.print(i + " ");
        }
    }
}

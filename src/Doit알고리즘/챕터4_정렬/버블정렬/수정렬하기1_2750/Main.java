package Doit알고리즘.챕터4_정렬.버블정렬.수정렬하기1_2750;
// 데이터를 오름차순으로 정렬하는 문제입니다. 사실 정렬을 Arrays.sort()를 이용하여 쉽게 정렬할 수 있지만
// 이번에는 직접 정렬을 구현하면서 문제를 풀어보도록 하겠습니다.
// 여러 정렬 알고리즘 중 하나를 선택해야 합니다.
// 데이터 크기를 보니 최대 1,000이 올 수 있습니다. 데이터 크기가 크기 않으니 성능을 좋지 않지만
// 작성하기 쉽고 직관적인 버블정렬 알고리즘을 사용하여 문제를 풀어보겠습니다.
// 참고로 버블 정렬은 시간복잡도가 O(n^2)입니다. 따라서 연산횟수는 1,000,000이 되고 0.01초로 예상할 수 있습니다.
// 문제에서 제한 시간이 1초이므로 버블 정렬을 사용해도 괜찮습니다.
// 수도코드
// 첫째 줄에 정렬할 데이터의 갯수를 입력받습니다.
// 데이터 갯수만큼의 길이를 가지는 배열을 생성합니다.
// 둘째 줄부터 한 줄에 한 데이터씩 입력받아 배열에 할당합니다.
// 버블 솔트 메서드에 배열을 매개변수로 입력받아 정렬된 배열을 반환받습니다.
// 정렬된 배열을 한 줄에 한 데이터씩 출력합니다.

import java.util.Scanner;

public class Main {
  public static int[] bubbleSort(int[] arr) {
    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr.length-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    return arr;
  }

  public static void print(int[] arr) {
    for (int i=0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    // 첫째 줄에 정렬할 데이터의 갯수를 입력받습니다.
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    // 데이터 갯수만큼의 길이를 가지는 배열을 생성합니다.
    int[] arr = new int[size];
    // 둘째 줄부터 한 줄에 한 데이터씩 입력받아 배열에 할당합니다.
    for (int i=0; i<size; i++) {
      arr[i] = in.nextInt();
    }
    // 버블 솔트 메서드에 배열을 매개변수로 입력받아 정렬된 배열을 반환받습니다.
    arr = bubbleSort(arr);
    // 정렬된 배열을 한 줄에 한 데이터씩 출력합니다.
    print(arr);
  }
}

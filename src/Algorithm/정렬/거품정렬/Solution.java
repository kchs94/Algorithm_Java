package Algorithm.정렬.거품정렬;
// 거품정렬
public class Solution {
  public static void bubbleSort(int[] arr) {
    System.out.print("배열: ");
    print(arr);
    for (int i=0; i<arr.length; i++) {        // 총라운드
      for (int j=0; j< arr.length-i-1; j++) { // 각 라운드
        if (arr[j] > arr[j+1]) {  // 비교
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
      System.out.print((i+1) + "단계: ");
      print(arr);
    }
  }
  public static void print(int[] arr) {
    for (int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    bubbleSort(new int[]{7, 4, 5, 1, 3});
  }
}

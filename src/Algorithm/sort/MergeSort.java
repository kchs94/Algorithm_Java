package Algorithm.sort;
/*
*
* */
public class MergeSort {

    private static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];   // 임시 저장 공간
        mergeSort(arr, temp, 0, arr.length -1); // 배열, 임시공간, 시작 인덱스, 끝 인덱스
    }

    private static void mergeSort(int[] arr, int[] temp, int start, int end) {
        if (start < end) {
            int mid = (start + end ) / 2;
            mergeSort(arr, temp, start, mid);
            mergeSort(arr, temp, mid + 1, end);
            merge(arr, temp, start, mid, end);
        }
    }

    /**
     * 배열방을 병합해주는 함수
     * @param arr
     * @param temp
     * @param start
     * @param mid
     * @param end
     */
    private static void merge(int[] arr, int[] temp, int start, int mid, int end) {

        for (int i= start; i<=end; i++) {
            temp[i] = arr[i];
        }
        int part1 = start;
        int part2 = mid + 1;
        int index = start;
        while (part1 <= mid && part2 <= end){
            if (temp[part1] <= temp[part2]) {
                arr[index] = temp[part1];
                part1++;
            } else {
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }
        for (int i=0; i<mid - part1; i++) {
            arr[index + 1] = temp[part1 + i];
        }
    }

    private static void printArray(int[] arr) {
        for (int data: arr) {
            System.out.print (data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,9,4,7,5,0,1,6,8,2};
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }
}

package 백준.정렬.수정렬하기_2750;
// 버블 정렬. 시간복잡도 O(n^2)
import java.util.Scanner;

public class 수정렬하기_2750 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
}

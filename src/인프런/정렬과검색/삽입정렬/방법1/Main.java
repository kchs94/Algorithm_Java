package 인프런.정렬과검색.삽입정렬.방법1;

import java.util.Scanner;

public class Main {

    public int[] insertSort(int n, int[] arr) {
        for (int i=1; i<n; i++) {   // 두 번째 원소부터 시작
            int target = arr[i];    // 타켓 설정
            int j;
            for (j=i-1; j>=0; j--) {    // j: 타겟으로 바로 앞 원소부터 비교
                if (target < arr[j]) {  // 바로 앞 원소가 타겟보다 크다면
                    arr[j+1] = arr[j];  // 앞 원소를 뒤로 민다.
                }
                else break; // 앞 원소가 타겟보다 작다면 그 앞에 있는 원소는 이미 정렬된 상태이므로 볼 필요 없다.
            }
            arr[j+1] = target;  // 마지막으로 현재 j위치에서 +1을 한 위치에 target을 넣어준다.
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        Main T = new Main();
        for (int x : T.insertSort(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

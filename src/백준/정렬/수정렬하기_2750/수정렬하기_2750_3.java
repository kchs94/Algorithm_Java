package 백준.정렬.수정렬하기_2750;
// 카운팅 정렬
import java.util.Scanner;

public class 수정렬하기_2750_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

		/*
		  range : -1000 ~ 1000
		  0 은 index[1000] 을 의미
		*/
        boolean[] arr = new boolean[2001];

        for(int i = 0; i < N; i++) {
            arr[in.nextInt() + 1000] = true;
        }

        // 정렬 과정이 따로 필요 없음

        for(int i = 0; i < 2001; i++) {
            if(arr[i]) {
                System.out.println(i - 1000);
            }
        }
    }
}

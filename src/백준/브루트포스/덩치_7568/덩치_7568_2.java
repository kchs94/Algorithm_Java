package 백준.브루트포스.덩치_7568;

import java.util.Scanner;

public class 덩치_7568_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[][] arr = new int[N][2];    // N명의 키와 몸무게를 저장할 배열

        for(int i=0; i<N; i++){
            arr[i][0] = in.nextInt();   // 몸무게
            arr[i][1] = in.nextInt();   // 키
        }

        for(int i=0; i<N; i++){

            int rank = 1;
            for(int j=0; j<N; j++){

                if(i == j)   continue;
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1])
                    rank++;
            }

            System.out.print(rank + " ");
        }
    }
}

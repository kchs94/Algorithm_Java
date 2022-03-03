package 백준.단계별문제풀이.브루트포스.블랙잭_2798;

import java.util.Scanner;

/*
* 브루트 포스 알고리즘: 모든 경우의 수를 검사하는 알고리즘. 가장 간단한 알고리즘.
* 문제:합
* 입력: 첫 줄에 카드 갯수 N(3<=N<100)과 카드 3장의 합 M(10<=M<300000) 둘째 줄에 카드에 쓰여 있는수 (100,000)을 넘지 않는다.
* 출력: M을 넘지 않으면서도 M에 최대한 가까운 카드 3장의 합을 출력
* 알고리즘
*
* */
public class 블랙잭_2798 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    public static int search(int[] arr, int N, int M){
        int result=0;

        // 3개를 고르기 때문에 첫 번째 카드는 N-2까지만 순회
        for(int i=0; i<N-2; i++){

            // 두 번째 카드는 첫 번째 카드 다음부터 N-1까지만 순회
            for(int j=i+1; j<N-1; j++){

                //세 번재 카드는 두 번째 카드 다음부터 N까지 순회
                for(int k=j+1; k<N; k++){

                    // 3개 카드의 합 변수 temp
                    int temp = arr[i] + arr[j] + arr[k];

                    // M과 세 카드의 합이 같다면 temp return 및 종료
                    if(M == temp){
                        return temp;
                    }

                    // 세 카드의 합이 이전 합보다 크면서 M보다 작은 경우 result 갱신
                    if(result < temp && temp < M ){
                        result = temp;
                    }
                }
            }
        }
        // 모든 순회를 마치면 result 리턴
        return result;
    }
}

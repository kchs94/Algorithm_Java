package 인프런.정렬과검색.LRU.방법1;

import java.util.Scanner;
/*
* size만큼의 배열을 선언합니다.
* 작업의 갯수만큼 반복합니다.
* 만약 캐시미스라면(=배열에 들어갈 값과 같은 값이 없다면)
*   i = size - 1부터 1까지 하나씩 줄면서
*   cache[i] = cache[i-1]
*   cache[0]에 현재 작업 할당
* 만약 캐시히트라면(=배열에 들어갈 값과 같은 값이 있다면)
*   히트가 난 지금의 인데스부터 i가 1까지 하나씩 줄면서 반복
*   cache[i] = cache[i-1]
*   cache[0] 히트난 값을 할당
* */
public class Main {

    public int[] solution(int size, int numOfJobs, int[] arr) {
        int[] cache = new int[size];    // 캐시 선언
        for (int x : arr) { // 작업 갯수만큼 반복
            int pos =-1;    // 인덱스 초기화

            for (int i=0; i<size; i++) {    // 캐시 히트가 있는지 없는지 확인하기 위해 반복
                if (x == cache[i])  // 같은 값이 있으면 그 값의 인덱스 값 저장
                    pos  = i;
            }

            if (pos == -1) {    // 1.캐시 미스라면
                for (int i = size-1; i>=1; i--) {   // 값을 전체적으로 오른쪽으로 당긴다.
                    cache[i] = cache[i-1];
                }
            }
            else {  // 2.캐시 히트라면
                for (int i = pos; i>=1; i--) {  // 히트된 인덱스까지 값을 오른쪽으로 당긴다.
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;   // 가장 최근 값은 현재 작업으로 할당한다.
        }
        return cache;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int numOfJobs = in.nextInt();
        int[] arr = new int[numOfJobs];
        for (int i=0; i<numOfJobs; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : T.solution(size, numOfJobs, arr)) {
            System.out.print(x + " ");
        }
    }
}

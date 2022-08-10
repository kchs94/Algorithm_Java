package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * - 분석
 * O(N^3) 단순 for문으로 완전탐색을 해야되는 경우 연산 횟수는 최악의 경우 80억이 된다.
 *
 * - 수도코드
 * - N 입력받기
 * - 크기가 N인 배열 생성하기
 * - 배열 요소 입력받기
 * - int start, end, count
 * - for k=0 ~N
 * - start = 0, end = N-1
 * - while(start<end) {
 * - if k > arr[start] + arr[end]
 *   - start++
 * - else if k < arr[start] + arr[end]
 *   - end--
 * - else if k == arr[start] + arr[end]
 *   - if k != start && k != end
 *       - count++ break;
 *   - else
 *       - start++ end--
 * */
public class 좋은수구하기_008 {

    static int N;
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        int goodNumCount = 0;
        for (int i = 0; i < N; i++) {
            if(isGoodNum(i))
                goodNumCount++;
        }
        System.out.println(goodNumCount);
        br.close();
    }

    public static boolean isGoodNum(int index) {
        long find = arr[index];
        int start = 0;
        int end = N-1;
        while (start < end) {
            long sum = arr[start] + arr[end];
            if (start == index) {
                start++;
                continue;
            }
            if (end == index) {
                end--;
                continue;
            }

            if (find == sum) {
                return true;
            } else if (find < sum) {
                end--;
            } else if (find > sum) {
                start++;
            }
        }
        return false;
    }
}

package 백준.단계별문제풀이.정렬.좌표압축_18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/*
* ---------------------
*   X1   X2  .. Xn
*  X'i = Xi보다 작은 좌표의 갯수
*
* -----------------------
* X'1 x'2  ... X'n을 출력한다.
*
* 수도코드
* 1.좌표의 갯수 N을 입력받는다.
* - 길이가 N인 배열은 선언한다.
* - StringTokenizer를 선언한다.
* 2.한 행에 N개 좌표의 값을 입력받는다.
* - 새로운 배열은 만들어서 값을 복사한다.a.clone()
* - 새로운 배열을 오름차순을 정렬합니다.Arrays.sort()
* - 정렬된 값이 X1보다 크면 인덱스로 X'1의 값을 구한다.
* 3.X'1 X'2 ... X'n값을 구한다.
*
* 4.X'1 X'2 ... X'n을 출력한다.
* */
public class 좌표압축_18870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // N 입력

        int[] arr = new int[N]; // 값을 저장할 배열 선언

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {    // 입력된 값을 배열에 저장
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr); // 정렬된 배열 완성

        // 중복된 배열 원소 제거하기
        List<Integer> list = new ArrayList<>();

        for(Integer i : sortedArr) {

            if(!list.contains(i)){
                list.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {

            int count = 0;
            for(Integer e : list) {

                if(arr[i] <= e) {
                    break;
                }
                count++;
            }
            sb.append(count + " ");
        }

        System.out.println(sb); // 출력
    }
}

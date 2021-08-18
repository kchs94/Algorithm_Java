package 코드업.데이터정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 선택정렬
* 1. 주어진 리스트 중에 최소값을 찾는다.
* 2. 그 값을 맨 앞에 위치한 값과 교체한다.
* 3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 반복한다.
*
* */
public class 선택정렬_1442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();

        // 입력
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 선택정렬
        int minIndex;
        int temp;
        for(int i=0; i<n-1; i++){
            minIndex = i;

            for(int j= i+1; j<n; j++){
                if(arr[j] < arr[minIndex]) minIndex = j;
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }


        // 출력
        for(int i=0; i<n; i++){
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb);
    }
}

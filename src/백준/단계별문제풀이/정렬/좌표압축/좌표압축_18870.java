package 백준.단계별문제풀이.정렬.좌표압축;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/*
* 1.첫째 줄에 X배열이 크기 N를 입력받는다.
* 2.둘째 줄에 배열 원소의 값들을 공백으로 분리하여 입력받는다.
* 3.
*
*
* */
public class 좌표압축_18870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        Map<Integer,Integer> map = new HashMap<>();

        int index = 0;
        for(int num : sortedArr) {
            if(!map.containsKey(num))
                map.put(num, index++);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(map.get(arr[i])).append(' ');
        }

        System.out.println(sb);
    }
}

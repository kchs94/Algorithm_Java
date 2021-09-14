package 백준.정렬.수정렬하기2_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class 수정렬하기2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>(N);    // 리스트 생성
        for(int i=0; i<N; i++){ // N번 반복
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list); // 정렬

        for(int value : list){  // 모든 인스턴스 출력
            sb.append(value).append('\n');
        }

        System.out.println(sb);
    }
}

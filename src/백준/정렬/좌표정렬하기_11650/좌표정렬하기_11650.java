package 백준.정렬.좌표정렬하기_11650;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 좌표정렬하기_11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 객체 비교
        Arrays.sort(arr,new Comparator<int[]>() {
           @Override
           public int compare(int[] e1, int[] e2) {
               if(e1[0] == e2[0]){  // x값이 같으면
                   return e1[1] - e2[1];    // y는 오름 차순으로
               }
               else {
                   return e1[0] - e2[0];    // x도 오름차순으로 정렬
               }
           }
        });
        
        // 출력
        for(int i=0 ;i<N; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }
        System.out.println(sb);
    }
}

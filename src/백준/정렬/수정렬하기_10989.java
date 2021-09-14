package 백준.정렬;

import java.io.*;


public class 수정렬하기_10989 {
    public static void main(String[] args) throws IOException {
       // 수의 범위(0~10000) 사실상 0은 제외
        int[] count = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            count[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        for(int i=1; i<10001; i++){
            // i값이 개수가 0이 될 때까지 출력(빈도수를 의미한다)
            while(count[i] > 0){
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}

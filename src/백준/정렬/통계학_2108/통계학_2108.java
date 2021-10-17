package 백준.정렬.통계학_2108;
/*
* 목표
* 1.평균 값을 구할 수 있다.
* 2.중앙 값을 구할 수 있다.
* 3.최빈 값을 구할 수 있다.
* 4.최대값과 최소값을 구할 수 있다.
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 통계학_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());    // 수의 갯수 입력(N은 홀수)
        int[] arr = new int[N]; // 범위가 [-4000, 4000]인 수를 담을 배열
        
        // 갯수만큼 입력 받기
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int min = arr[0];

        long average = getAverage(arr);  // 평균값
        int median = getMedian(arr);    // 중앙값
        int mode = getMode(arr);        // 최빈값
        int differenceFromMinToMax = max - min; // 범위(최댓값-최솟값)

        sb.append(average + "\n");
        sb.append(median + "\n");
        sb.append(mode + "\n");
        sb.append(differenceFromMinToMax + "\n");

        System.out.println(sb);
    }
    
    // 평균값
    private static long getAverage(int[] arr) {
        int sum = 0;
        int length = arr.length;

        for(int i=0; i<length; i++){    // 원소 합 구하기
            sum += arr[i];
        }
        
        return Math.round((double)sum / length);    // 평균값 = 원소의 합 / 원소의 갯수
    }

    // 중앙 값
    private static int getMedian(int[] arr) {
        int length = arr.length;

        return arr[length / 2]; // 중앙값 = 원소의 갯수 / 2
    }
    
    // 최빈값
    private static int getMode(int[] arr) {
        int[] count = new int[8001];    // count 배열의 인덱스: 값 count 배열의 값: 빈도
        int mode = 0;   // 최빈 값

        // count 배열에 빈도 값 넣기
        for(int i=0; i<arr.length; i++){
            count[arr[i] + 4000]++;
        }
        
        // 다 잊고 배열의 최댓값 찾기 만약 최댓값이 여러 개 일 경우 2번째 순차로 오는 최댓값 찾기
        int max =count[0];
        boolean flag = false;

        // 최대 빈도의 값 구하기
        for(int i=0; i<8001; i++){
            if(max <= count[i]){
                max =count[i];
                mode = i-4000;  //최대 빈도수가 유일한 경우를 대비해서 먼저 최빈값 구하기
            }
        }
        
        for(int i=0; i<8001; i++){
            if(max == count[i]){
                if(flag == false)
                    flag = true;
                else if(flag == true){
                    mode = i-4000;
                    break;
                }
            }
        }

        return mode;
    }
}

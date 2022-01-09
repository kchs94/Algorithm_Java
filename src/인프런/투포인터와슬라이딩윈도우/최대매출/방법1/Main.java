package 인프런.투포인터와슬라이딩윈도우.최대매출.방법1;

import java.util.Scanner;

public class Main {

    public int solution(int days, int sequence, int[] arr) {
       int max = Integer.MIN_VALUE; // 최댓값
       int sum = 0 ;    // 합을 담을 임시 변수
       for (int i=0; i<sequence; i++) { // 우선 초기값 설정
           sum += arr[i];
       }
       max = sum;   

       for (int i= sequence; i<days; i++) { 
           sum += (arr[i] - arr[i-sequence]);   // 윈도우를 오른쪽으로 옮기기
           max = Math.max(sum, max);    // 큰 값을 max에 넣어주기
       }

       return max;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int[] arr = new int[days];
        int sequence = in.nextInt();
        for (int i=0; i<days; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(days, sequence, arr));
    }
}

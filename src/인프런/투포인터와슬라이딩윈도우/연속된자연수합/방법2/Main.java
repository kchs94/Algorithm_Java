package 인프런.투포인터와슬라이딩윈도우.연속된자연수합.방법2;

import java.util.Scanner;

/*
* 연속 --> 투포인터 or 슬라이딩 --> 배열 길이 변화 --> 투포인터 알고리즘 사용
* 입력 최대가 999이고 2개 이상 연속된 자연수의 합이므로 1부터 500을 갖는 배열 선언
* for문의 경우 시간복잡도가 성능이 안좋으므로 투포인터 알고리즘 사용
*
* */
public class Main {
    public int solution(int n) {
        int answer=0;
        int sum=0;
        int start = 0;
        int m=n/2+1;
        int[] arr = new int[m];

        for (int i=0; i<m; i++)
            arr[i] = i+1;

        for (int end=0; end < m ; end++) {
            sum+=arr[end];
            if (sum ==n)
                answer++;
            while (sum>=n) {
                sum -= arr[start++];
                if (sum == n)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}

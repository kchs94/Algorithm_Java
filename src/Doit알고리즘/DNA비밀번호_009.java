package Doit알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/12891
* 1.분석
* 데이터 크기: 1,000,000
* 제한시간: 2초
* 시간복잡도: 슬라이드 윈도우 O(n)
* 2.수도코드
* - DNA 문자열 길이 S와 부분 문자열 길이 P를 입력받는다.
* - DNA 문자열을 입력받는다.
* - 조건 배열을 생성한다.
* - 슬라이딩 윈도우 알고리즘을 적용한다.
* - 만들 수 있는 비밀번호 갯수를 출력한다.
* */
public class DNA비밀번호_009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();
        int[] rules = new int[4];
        int[] used = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
            rules[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<P; i++) {
            if (arr[i] == 'A') used[0]++;
            else if (arr[i] == 'C') used[1]++;
            else if (arr[i] == 'G') used[2]++;
            else if (arr[i] == 'T') used[3]++;
        }
        int start = 0, end = P-1;
        boolean isDNA = true;
        int answer = 0;
        while(end < S) {

            for (int i=0; i<4; i++) {
                if (used[i] < rules[i]) {
                    isDNA = false;
                    break;
                }
            }

            if (isDNA) answer++;
            if (end == S-1) break;
            end++;
            if (arr[end] == 'A') used[0]++;
            else if (arr[end] == 'C') used[1]++;
            else if (arr[end] == 'G') used[2]++;
            else if (arr[end] == 'T') used[3]++;

            if (arr[start] == 'A') used[0]--;
            else if (arr[start] == 'C') used[1]--;
            else if (arr[start] == 'G') used[2]--;
            else if (arr[start] == 'T') used[3]--;
            start++;
            isDNA = true;
        }
        System.out.println(answer);
    }
}

package 백준.문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 문자열에서 부분문자열을 찾는 문제이므로 슬라이딩 알고리즘으로 문제를 해결할 수 있습니다.
*
* DNA 문자열 길이 S와 비밀번호로 사용할 문자열 길이 P를 입력받습니다.
* DNA 문자열을 입력받습니다.
* DNA 문자열을 문자별로 char 배열에 저장합니다.
* 'A', 'C', 'G', 'T'의 최소 갯수를 입력받습니다.
* 입력받은 각 최소 갯수를 각 변수에 할당합니다.
* 부분 문자열 길이 p만큼 반복하여 현재 각 a,c,g,t 갯수를 설정합니다.
* 투 포인터 인덱스 start를 0으로 end를 P-1로 초기화합니다.
* e가 P-1부터 S-1까지 반복합니다.
*   만약 현재 문자열이 조건을 만족하면 count++를 해줍니다.
*   s가 가리키는 현재값을 빼주고 s++을 해줍니다.
*   end++을 해주고 그 위치의 값을 더해줍니다.
* count를 출력합니다.
* */
public class DNA비밀번호_12891 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int S = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());
    char[] A = br.readLine().toCharArray();
    st = new StringTokenizer(br.readLine(), " ");
    int[] conditions = new int[4];
    for (int i=0; i<4; i++) { // A, C, G, T
      conditions[i] = Integer.parseInt(st.nextToken());
    }
    for (int i=0; i<P; i++) {
      if (A[i] == 'A') conditions[0]--;
      else if (A[i] == 'C') conditions[1]--;
      else if (A[i] == 'G') conditions[2]--;
      else conditions[3]--;
    }
    int start = 0;
    int end = P-1;
    int answer = 0;
    for (int i=P-1; i<P; i++) {
      if (conditions[0] == 0 && conditions[1] == 0 && conditions[2] == 0 &&
      conditions[3] == 0) answer++;
      else{

      }
      if (A[i] == 'A') conditions[0]++;

    }

    System.out.println(answer);
  }
}

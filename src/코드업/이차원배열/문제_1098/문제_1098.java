package 코드업.이차원배열.문제_1098;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
*
* 1.격자판의 세로, 가로가 입력됩니다.
* 2.격자판의 크기에 대응하는 2차원 배열을 생성합니다.
* 3.두 번째 줄에 막대의 갯수 n을 입력받습니다.
* 4.세 번째줄부터 3+n줄까지 길이(l), 방향(d), 좌표(x,y)를 입력합니다.
* */
public class 문제_1098 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 많은 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int height = Integer.parseInt(st.nextToken());
        int width  = Integer.parseInt(st.nextToken());
        int[][] board = new int[height+1][width+1];// 격자판

        int numOfStick = Integer.parseInt(br.readLine());   // 막대기 갯수
        int length, direction,x,y;  // 길이, 방향, x좌표,y좌표

        for(int i=0; i<numOfStick; i++) {    // 막대기 갯수만큼 반복
            st = new StringTokenizer(br.readLine());
            length = Integer.parseInt(st.nextToken());
            direction = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if (direction == 0) { // 오른쪽
                for (int j = 0; j < length; j++) {    // 길이만큼
                    board[x][y++] = 1;
                }
            } else { // 아래
                for (int j = 0; j < length; j++) {    // 길이만큼
                    board[x++][y] = 1;
                }
            }
        }

        // 출력
        for(int i=1; i<=height; i++){
            for(int j=1; j<=width; j++){
                sb.append(board[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

package 백준.단계별문제풀이.일차원배열;
import java.util.Scanner;

public class OX퀴즈_8958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = new String[in.nextInt()];    // 테스트 케이스 갯수

        for(int i=0; i<arr.length; i++){
            arr[i] = in.next();
        }
        in.close();

        // 점수 계산하기
        for(int i=0; i<arr.length; i++){
            int count=0;    // 연속 횟수
            int sum=0;  // 누적 합산

            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    count++;
                }
                else{   // X인 경우
                    count = 0;
                }
                sum += count;   // 합산
            }
            System.out.println(sum);
        }


    }
}

package 백준.함수.한수;
import java.util.Scanner;
// 한수: 어떤 양의 정수 X의 각 자리수가 등차수열을 이룰 때 X를 가리키는 말.
// 예를들어 '123' '369' '2468'
// N이 주어졌을 때 [1,N] 범위 안에서 한수의 갯수를 출력하세요. (1<=N<=1000)
// 한수를 구하는 함수를 만든 후 N까지 반복
// 1~99까지는 모두 한수이다.
public class 한수_1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        int count=0;    // 한수 갯수
        
        // 한수 판별
        if(N <100){     // (1<=N<100)
            count = N;
        }
        else{           // (100<=N<=1000)
            count +=99;
            if(N == 1000)
                N=999;
            for(int i=100; i<=N; i++)
                if(isHanSoo(i))
                    count++;
        }
        System.out.println(count);
    }

    public static boolean isHanSoo(int number){
        int hun = number / 100;
        int ten = (number/10) % 10;
        int one = number%10;
        if(2*ten == one+hun)  // 등차중항
            return true;
        return false;
    }
}

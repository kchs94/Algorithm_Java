package 백준.스택;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 제로_10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());    // 갯수 K 입력
        int num;
        int sum = 0;
        for(int i=0; i<K; i++){
            num = Integer.parseInt(br.readLine());
            if(num == 0){
                sum -= stack.pop();
            }
            else
                sum += stack.push(num);
        }

        System.out.println(sum);
    }
}

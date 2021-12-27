package 인프런.배열.큰수출력하기.방법2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public ArrayList<Integer> solution(int num, int[] nums) {
       ArrayList<Integer> answer = new ArrayList<>();

       answer.add(nums[0]);
       for(int i=1; i<num; i++) {
           if(nums[i] > nums[i-1])
               answer.add(nums[i]);
       }

       return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {    // N번 입력받기
            arr[i] = in.nextInt();
        }

        for(int x : T.solution(N,arr)) {
            System.out.print(x + " ");
        }
    }
}

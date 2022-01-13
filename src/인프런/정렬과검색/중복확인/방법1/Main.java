package 인프런.정렬과검색.중복확인.방법1;

import java.util.*;

/*
* 앞에서 중복이 나왔는데도 불구하고 10만명의 대답을 모두 들어야할 필요는 없다.
* 앞에서부터 한명씩 들으면서 만약 중복이 생기면 바로 'D'를 출력하고 탐색을 종료한다.
* 중복인지 확인하려면 앞에 학생들이 무슨 숫자를 선택했는지 알아야한다.
* */
public class Main {
    public char solution(int n, int[] arr) {
        char answer ='U';
        List<Integer> list = new ArrayList<>();

        for (Integer x : arr) {
            if (list.contains(x)){
                answer = 'D';
                break;
            }
            list.add(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}

package 인프런.해시맵과트리셋.매출액의종류.방법1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
* 시간초과 왜?
* */
public class Main {
    public int[] solution(int days, int section, int[] arr) {
        int[] kinds = new int[days - section + 1];
        Set<Integer> set;

        for (int i=0; i<kinds.length; i++) {
            set = new HashSet<>();
            for (int j = i; j<i+section; j++) {
                set.add(arr[j]);
            }
            kinds[i] = set.size();
        }
        return kinds;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int section = in.nextInt();
        int[] arr = new int[days];
        for(int i=0; i<days; i++) {
            arr[i] = in.nextInt();
        }
        for (int i : T.solution(days, section, arr)) {
            System.out.print(i + " ");
        }
    }
}

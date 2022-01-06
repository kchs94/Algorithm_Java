package 인프런.해시맵과트리셋.매출액의종류.방법2;

import java.util.*;

/*
* 시간초과 왜?
* */
public class Main {
    public ArrayList<Integer> solution(int days, int section, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int startPoint = 0;
        int endPoint = section-1;

        // 초기 셋팅
        for (int i=0; i<endPoint; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // 투포인터 알고리즘
        while(endPoint < days) {
            map.put(arr[endPoint], map.getOrDefault(arr[endPoint], 0) + 1);
            endPoint++;
            list.add(map.size());
            map.put(arr[startPoint], map.get(arr[startPoint])-1);
            if(map.get(arr[startPoint]) == 0)
                map.remove(arr[startPoint]);
            startPoint++;
        }
        return list;
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

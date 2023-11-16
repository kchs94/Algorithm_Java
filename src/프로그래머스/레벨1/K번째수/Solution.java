package 프로그래머스.레벨1.K번째수;
// ArrayList<Integer> 이용 [i, j]까지 자른다
// ArrayList --> int[]로 담기
// int[] Arrays.sort()로 정렬
// 인덱스로 접근
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] answer1 = new int[commands.length];

        // ArrayList에 [i,j]까지 값 담기 그리고 int[]에 옮기기
        for(int i=0; i<commands.length; i++ ){
            // ArrayList<Integer> 이용 [i, j]까지 자른다
            ArrayList<Integer> List = new ArrayList<>();

            for(int j=commands[i][0]; j<=commands[i][1]; j++){
                List.add(array[j-1]);
            }

            int[] arrSort = new int[List.size()];
            for(int k=0; k<List.size(); k++){
                arrSort[k] = List.get(k);
            }
            Arrays.sort(arrSort);   // 오름차순 정렬
            // 3번째 값
            answer[i] = arrSort[commands[i][2]-1];
        }

        for (int i=0; i< commands.length; i++) {
            // ArrayList<Integer> 이용
            ArrayList<Integer> list = new ArrayList<>();

            for (int j=commands[i][0]; j<=commands[i][1]; j++) {
                list.add(array[j-1]);
            }

            int[] arrSort = new int[list.size()];

        }
        return answer;
    }
}
package 붓캠.데일리.powerSet_31;

import java.util.*;

public class Solution {

    ArrayList<String> answer = new ArrayList<>();
    String filterStr;
    boolean[] checked;

    public ArrayList<String> powerSet(String str) {
        // 문자열에서 중복을 제거한다.
        String[] arr = str.split("");

        Set<String> set = new LinkedHashSet<>();
        for (String e : arr) {
            set.add(e);
        }

        StringBuilder sb = new StringBuilder();
        for (String e : set)
            sb.append(e);

        filterStr = sb.toString();
        char[] charArr = filterStr.toCharArray();
        Arrays.sort(charArr);
        filterStr = new String(charArr);
        checked = new boolean[filterStr.length()];


        // DFS를 하여 한 문자씩 접근한다.
        dfs(0, true);
        dfs(0, false);

        Collections.sort(answer);

        return answer;
    }

    public void dfs(int depth, boolean check) {    // abc, 3
        if (check)
            checked[depth] = true;
        else
            checked[depth] = false;

        if (depth == filterStr.length()-1) {
            StringBuilder temp = new StringBuilder();
            for (int i=0; i<checked.length; i++) {
                if (checked[i])
                    temp.append(filterStr.charAt(i));
            }
            answer.add(temp.toString());
        }
        else {
            dfs(depth + 1, true);
            dfs(depth + 1, false);
        }
    }

    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.powerSet("abc"));
    }
}

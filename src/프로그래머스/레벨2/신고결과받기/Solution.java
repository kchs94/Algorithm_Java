package 프로그래머스.레벨2.신고결과받기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length]; // id_list 길이로 설정

        // 1.중복제거
//        HashSet<String> uniqueReport = new HashSet<>();
//        for(String str : report) {
//            uniqueReport.add(str);
//        }
        HashSet<String> uniqueReport = new HashSet<>();
        for (String str : report) {
            uniqueReport.add(str);
        }

        // 2.신고자 List Map 만들기
        HashMap<String, ArrayList<String>> reporterListMap = new HashMap<>();
        for (String str : uniqueReport) {
            String[] temp = str.split(" ");

            String reporter = temp[0];
            String reportee = temp[1];

            ArrayList<String> reporterList = reporterListMap.getOrDefault(reportee, null);
            if (reporterList == null) reporterList = new ArrayList<>();

            reporterList.add(reporter);
            reporterListMap.put(reportee, reporterList);
        }

        // 3.이메일 받을 횟수를 저장할 Map 만들기
        HashMap<String, Integer> countEmailMap = new HashMap<>();
        for (ArrayList<String> reporterList : reporterListMap.values()) {
            if (reporterList.size() >= k)
                for (String reporter : reporterList)
                    countEmailMap.put(reporter, countEmailMap.getOrDefault(reporter,0)+1);
        }

        // 4.numOfEmailMap을 사용해서 정답 구하기
        for (int i=0; i< id_list.length; i++) {
            answer[i] = countEmailMap.getOrDefault(id_list[i], 0);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
//        String[] id_list = {"con", "ryan"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//        int k = 3;

        sol.solution(id_list, report, k);
    }
}



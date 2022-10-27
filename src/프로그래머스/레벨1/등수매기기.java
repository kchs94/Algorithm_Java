package 프로그래머스.레벨1;

import java.util.Arrays;

public class 등수매기기 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[answer.length];

        Arrays.fill(answer, 1   );

        int eng, math;
        for (int i=0; i<score.length; i++) {
            eng = score[i][0];
            math = score[i][1];
            avg[i] = (eng + math) / 2.0;
        }

        for (int i=0; i<avg.length-1; i++) {
            for (int j=i+1; j<avg.length; j++) {
                if (avg[i] > avg[j])
                    answer[j]++;
                else if (avg[i] < avg[j])
                    answer[i]++;
            }
        }

        return answer;
    }
}

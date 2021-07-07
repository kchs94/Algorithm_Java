package 프로그래머스.레벨1.모의고사;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] student = new int[3][answers.length];
        int[] count = {0,0,0};   // 맞은 갯수
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=0; i<3; i++){
            for(int j=0; j<answers.length; j++){
                if(i == 0)  student[i][j] = j%5 +1;
                else if(i == 1){
                    if(j%2 == 0)    student[i][j] =2;
                    else if(j%8 == 1)   student[i][j] = 1;
                    else if(j%8 == 3)   student[i][j] = 3;
                    else if(j%8 == 5)   student[i][j] = 4;
                    else if(j%8 == 7)   student[i][j] = 5;
                }
                else{
                    if(j%10 ==0 || j%10 == 1)   student[i][j] = 3;
                    else if(j%10==2 || j%10==3) student[i][j] = 1;
                    else if(j%10==4 || j%10==5) student[i][j] = 2;
                    else if(j%10==6 || j%10==7) student[i][j] = 4;
                    else if(j%10==8 || j%10==9) student[i][j] = 5;
                }
            }
        }

        for(int i=0; i< answers.length; i++){
            if(answers[i] == student[0][i])  count[0]++;
            if(answers[i] == student[1][i])  count[1]++;
            if(answers[i] == student[2][i])  count[2]++;
        }

        if(count[0]> count[1] && count[0] > count[2]){
            arrList.add(1);
        }
        else if(count[1] > count[0] && count[1] > count[2]){
            arrList.add(2);

        }
        else if(count[2] > count[0] && count[2] > count[1]){
            arrList.add(3);

        }
        else if(count[0]> count[2] && count[1] > count[2]){
            arrList.add(1);
            arrList.add(2);
        }
        else if(count[0] > count[1] && count[2] > count[1]){
            arrList.add(1);
            arrList.add(3);
        }
        else if(count[1] > count[0] && count[2] > count[0]){
            arrList.add(2);
            arrList.add(3);
        }
        else if(count[0] == count[1] && count[1] == count[2]){
            arrList.add(1);
            arrList.add(2);
            arrList.add(3);
        }

        int[] answer = new int[arrList.size()];
        for(int i=0; i<arrList.size(); i++){
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
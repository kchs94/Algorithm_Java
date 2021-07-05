package 프로그래머스.레벨1.이천16년;

//31일(1,3,5,7,8,10,12), 30일(4,6,9,11),29일(윤년 2월)
//1.월을 일로 바꿔준다
//2.일만큼 추가한다
//3.7로 나눈 나머지의 값별로 요일을 결정한다.

class Solution {
    public String solution(int a, int b) {
        int dDay = 0;
        String[] week = {"THU","FRI","SAT","SUN", "MON","TUE","WED"};

        for(int i=1; i<a; i++){
            if(i==4 || i==6 || i==9 || i==11)
                dDay += 30;
            else if(i==2)
                dDay += 29;
            else
                dDay += 31;
        }
        dDay +=b;

        return week[dDay%7];
    }
}
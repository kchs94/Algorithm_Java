package 프로그래머스.레벨1.숫자문자열영단어;
// FOR i=0 to 9 do{
//      i의 영단어가 없을 때까지 반복한다
//          i의 영단어가 있으면 숫자 i로 바꿔준다
//}
// 문자열을 정수로 바꿔준다.



class Solution {
    public static String getStringNum(int i){
        String strNum="";
        switch(i){
            case 0:
                strNum = "zero";
                break;
            case 1:
                strNum = "one";
                break;
            case 2:
                strNum = "two";
                break;
            case 3:
                strNum = "three";
                break;
            case 4:
                strNum = "four";
                break;
            case 5:
                strNum = "five";
                break;
            case 6:
                strNum = "six";
                break;
            case 7:
                strNum = "seven";
                break;
            case 8:
                strNum = "eight";
                break;
            case 9:
                strNum = "nine";
                break;
        }
        return strNum;
    }


    public int solution(String s) {


        for(int i=0; i<10; i++){
            while(s.indexOf(getStringNum(i)) != -1){
                s = s.replaceAll(getStringNum(i), String.valueOf(i));
            }
        }

        int answer = Integer.parseInt(s);
        return answer;
    }
}
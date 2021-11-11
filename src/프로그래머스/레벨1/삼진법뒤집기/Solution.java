package 프로그래머스.레벨1.삼진법뒤집기;

// 1.10진법을 3진법으로 바꾼다
// 2.3진법 문자열을 뒤집는다
// 3.뒤집어진  3진법을 10진법으로 바꾼다.
class Solution {
    public int solution(int n) {
        String str = "";
        // 1.10진법을 3진법으로 바꾼다
        while(n>0){
            str = (n%3) + str;
            n = n/3;
        }

        // 2.3진법 문자열을 뒤집는다
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();

        int decimal = 0;
        for(int i=0 ; i<str.length(); i++) {

            int digit = str.charAt(i) - '0';

            decimal += (digit) * Math.pow(3, str.length()-(i+1));
        }

        return decimal;
    }
}
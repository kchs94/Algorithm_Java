package 프로그래머스.레벨1;
/*
* 문자열 길이가 n이라면 n번 밀어서 확인해야됨
* 예시
* 0,1,2,3,4
*
* 0,1,2,3,4    substring(0,len)
* 4,0,1,2,3    substring(len-1) + substring(0,len-1)
* 3,4,0,1,2,   substring(len-2) + substring(0,len-2)
* 2,3,4,0,1,   substring(len-3) + substring(0,len-3)
* 1,2,3,4,0     substring(len-4) + substring(0,len-4)
*
* 방법2
* B의 문자열을 2번 붙여서 IndexOf를 활용한 방법
* */
public class 문자열밀기 {
    public int solution(String A, String B) {
        /*int len = A.length();
        int count = 0;
        for (int i=0; i<len; i++) {
            if (i == 0) {
                if(A.equals(B)) return count;
            }
            else {
                String result = A.substring(len - i) + A.substring(0, len - i);
                if (result.equals(B)) return count;
            }
            count++;
        }
        return -1;*/
        return (B+B).indexOf(A);
    }
}

package 프로그래머스.레벨1.서울에서김서방찾기;

/*
 * KeyPoint
 * String형 배열에서 특정 값 찾아 인덱스 반환하기
 *
 * Solution
 * for + equals()이용하기
 * */

class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){ // 값이 같은지 판별할 땐 equal() 사용, seoul[i] == "Kim"은 동일한 객체인지 판별할 때 사용
                answer = "김서방은 " + i + "에 있다";
                break;  // 인덱스를 찾으면 뒤에 반목문은 실행할 필요가 없다. break는 반복문을 탈출하고 return 함수를 탈출한다.
            }
        }
        return answer;
    }
}
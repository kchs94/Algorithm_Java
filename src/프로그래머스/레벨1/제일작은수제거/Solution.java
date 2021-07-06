package 프로그래머스.레벨1.제일작은수제거;

class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        // 최솟값 구하기
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }


        int[] answer = new int[arr.length -1];

        int idx = 0; // 최솟값일 때 인덱스 증가를 멈추기 위해 따로 변수 설정
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min)
                continue;

            answer[idx] = arr[i];
            idx++;
        }
        return answer;
    }
}
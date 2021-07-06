package 프로그래머스.레벨1.콜라츠추측;

class Solution {
    public int solution(long num) {
        int count = 0;

        while(count<500){
            if(num == 1)
                return count;
            else if(num%2 == 0)
                num /= 2;
            else
                num = 3*num +1;

            count++;
        }

        return -1;
    }
}
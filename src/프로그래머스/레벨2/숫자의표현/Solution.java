package 프로그래머스.레벨2.숫자의표현;

public class Solution {
    public static void main(String[] args) {
        int n =15;
        int count=0;
        int sum=0;


        for(int i=1; i<=n/2; i++){
            sum=0;
            for(int j=i; j<n; j++){
                sum +=j;
                if(sum == n){
                    count++;
                    break;
                }
                else if (sum > n){
                    break;
                }
            }
        }
        count++;

        System.out.println(count);
    }
}

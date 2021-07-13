package 알고리즘;

public class 각자리수구하기 {
    public static void main(String[] args) {
        int n = 12345;
        int digit=0;
        while(n != 0){
            digit = n%10;
            n = n/10;
        }
    }
}

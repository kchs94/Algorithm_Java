package 백준.단계별문제풀이.함수.정수N개의합;

public class 정수N개의합_15596 {
    // 배열의 합을 반환하는 함수
    public static long sum(int[] a){
        long sum=0;  // 정수 N개의 누적 합
        for(int i=0; i<a.length; i++)
            sum += a[i];
        return sum;
    }
}

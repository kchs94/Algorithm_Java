package 백준.기본수학2.골드바흐의추측_9020;

import java.util.Scanner;

public class 골드바흐의추측_9020 {

    public static boolean[] prime = new boolean[10001]; // 인덱스를 소수 판별할 숫자로 인식

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        make_prime();

        int T = in.nextInt();   // 테스트케이스

        for(int i=0; i<T; i++){
            int n = in.nextInt();
            int first_partition = n / 2;
            int second_partition = n / 2;

            while(true){
                // 두 파티션이 모두 소수일 경우
                if(!prime[first_partition] && !prime[second_partition]){
                    System.out.println(first_partition + " " + second_partition);
                    break;
                }
                first_partition--;
                second_partition++;
            }
        }
    }

    // N 이하의 소수 생성 메소드
    public static void make_prime(){
        /*
        * 소수(false)
        * 소수X(true)
        * */
        prime[0] = prime[1] = true;

        // 제곱근 함수 : Math.sqrt()
        for(int i=2; i<=Math.sqrt(prime.length); i++){
            // 이미 체크된 배열이라면 다음 반복문으로 스킵
            if(prime[i] == true){
                continue;
            }

            // i의 2이상의 배수들을 걸러주기 위한 반복문
            for(int j = i*i; j<prime.length; j = j+i){
                prime[j] = true;
            }
        }
    }

}

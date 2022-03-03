// 문제:https://www.acmicpc.net/problem/4673
package 백준.단계별문제풀이.함수.셀프넘버;
// 알고리즘: 1부터 10000까지 검사한 뒤, 해당 수를 생성자로 하는 수가 있으면(=셀프넘버가 아니면)  그 수를 거르는 것입니다.
public class 셀프넘버_4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];   // 1부터 10000까지 이므로

        for(int i=0; i<=10000; i++){
            int n = d(i);

            if(n < 10001)  // 10000이 넘는 수는 필요 없다.
                check[n] =  true;
        }

        StringBuffer sb = new StringBuffer();

        for(int i=1; i<10001; i++){
            if(!check[i])
                sb.append(i).append('\n');
        }
        System.out.println(sb);
    }

    // 입력 값을 생성자로 하는 수를 리턴. 예를들어 33을 입력하면 33+3+3=39를 리턴합니다.
    public static int d(int number){
        int sum = number;   // sum: 원래 수 + 각 자리수들
        int digit=0;        // digit: 각 자리수 값을 담을 변수

        while(number !=0){  // number가 0이면 더 이상 자리수가 없다는걸 의미합니다.
            digit = number%10;  // 일의 자리수부터 값을 구합니다.
            sum +=digit;        // 구한 자리수를 sum 변수에 담습니다.
            number = number/10; // 다음 자리수를 구할 준비를 합니다.
        }
        return sum;     // sum: number를 생성자로 하는 수 [2,4,6,8,10...]
    }
}

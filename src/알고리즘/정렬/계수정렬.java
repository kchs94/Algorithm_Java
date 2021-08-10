package 알고리즘.정렬;

public class 계수정렬 {
    public static void main(String[] args) {
        int[] array = new int[100]; // 수열의 원소: 100개
        int[] counting = new int[31];   // 수의 범위 : 0 ~ 30
        int[] result = new int[100];    // 정렬 될 배열

        for (int i=0; i<array.length; i++){
            array[i] = (int)(Math.random()*31); // 0~30
        }

        // 1.카운팅하기
        for(int i=0; i<array.length; i++){
            counting[array[i]]++;
        }

        // 2.누적합구하기
        for(int i=1; i<counting.length; i++)
            counting[i] += counting[i-1];

        // 3.정렬된 배열 구하기
        for(int i=array.length-1; 0 <= i; i--){

            int value = array[i];
            counting[value]--;
            result[counting[array[i]]] = value;
        }

        // 결과 출력
        for(int i=0; i<result.length; i++){
            if( i%10 == 0 ) System.out.println();
            System.out.print(result[i] + "\t");
        }
        System.out.println();
    }
}

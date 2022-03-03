package 백준.단계별문제풀이.브루트포스.덩치_7568;

import java.util.Scanner;

/*
* 문제: 학생 N명의 몸무게와 키를 입력받아서 각 사람의 덩치 등수를 계산하여 출력하는 프로그램을 작성하세요.
* 조건: 덩치가 크다 = 몸무게와 키 둘 다 크다. 덩치 등수 = 자신보다 더 `큰 덩치`의 사람의 수, 더 덩큰 수:k명, 내 등수: k+1,
* 같은 등수 여러 명 가능.
* 입력: 첫째 줄에 사람 수 N, 둘째 줄부터  몸무게 x와 키 y를 N번 입력합니다.(2<=N<=50, 10<=x,y<=200)
* 출력: 덩치 등수를 계산 후 입력 순서대로 첫 줄에 출력합니다. 각 덩치 등수는 공백문자로 분리합니다.
* 알고리즘:완전탐색(=브루트포스)
* 1.전체 사람 수 N을 정수형으로 입력받습니다.
* 2.각 줄마다 한 사람의 몸무게 x와 키 y를 정수형 배열로 입력합니다.
* 3.각 사람마다 등수를 저장할 정수형 배열을 N만큼 선언합니다.
* 3.각 배열의 원소를 완전 탐색합니다.(이중 포문)
* 3-1.앞 원소가 덩치가 크면 뒤 원소의 등수를 +1합니다.
* 3-2.뒤 원소가 덩치가 크면 앞 원소의 등수를 +1합니다.
* 3-3. 두 원소는 덩치를 비교할 수 없으면 pass합니다.
* 4.각 사람의 등수를 출력합니다.
* */
public class 덩치_7568 {
    public static void main(String[] args) {
        // 입력
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] weight = new int[N];  // 몸무게
        int[] height = new int[N];  // 키
        int[] rank = new int[N];    // 등수

        for(int i=0; i<N; i++){
            weight[i] = in.nextInt();
            height[i] = in.nextInt();
            rank[i] = 1;
        }

        
        for(int i=0; i<N-1; i++){   // 전자 원소

            for(int j=i+1; j<N; j++){   // 후자 원소

                if(weight[i]>weight[j] && height[i]>height[j])  // 앞 원소가 더 클 때
                    rank[j]++;
                else if(weight[i]<weight[j] && height[i]<height[j]) // 뒤 원소가 더 클 때
                    rank[i]++;
                else    // 덩치를 비교할 수 없을 때.
                    continue;
            }
        }

        // 출력
        for(int i=0; i<N; i++){
            System.out.print(rank[i] + " ");
        }
    }
}

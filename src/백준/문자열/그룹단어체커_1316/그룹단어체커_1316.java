package 백준.문자열.그룹단어체커_1316;
/*
* 문제: 그룹단어란 단어에 존재하는 모든 문자에 대해, 각 문자가 연속해서 나타나는 단어를 말한다.
* 단어 N개를 입력으로 받아 그룹단어의 개수를 출력하는 프로그램을 작성하세요.
* 입력: 첫째 줄에 단어의 개수 N이 입력된다. 1<=N<=100. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만
* 되어있고 중복되지 않으며 길이는 최대 100이다.
* 출력: 첫째 줄에 그룹단어의 갯수를 출력한다.
* 알고리즘
* 1.단어의 개수 N개를 입력받는다.
* 2.N개의 단어를 입력한다. 단어는 중복되지 않게 입력한다.
* 3.N번 반복하여 단어가 그룹단어인지 판별하여 맞으면 카운트한다.
*   3-1.
* 4.출력한다.
* */

import java.util.Scanner;

public class 그룹단어체커_1316 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;
        int N = in.nextInt();

        for(int i=0; i<N; i++) {
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check(){
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = in.next();

        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);    // i번째 문자의 아스키코드값 저장(현재 문자)

            //앞선 문자와 i번재 문자가 다르면
            if(prev != now){

                // 해당 문자가 처음 나오는 경우 (false인 경우)
                if(check[now - 'a'] == false){
                    check[now - 'a'] =true;     // true로 바꿔준다.
                    prev = now;     // 다음 턴을 위해 prev도 바꿔준다.
                }
                // 해당 문자가 이미 나온 적이 있는 경우(그룹 단어가 아니게 됨)
                else{
                    return false;
                }
            }

            // 앞선 문자와 i번째 문자가 같다면?(연속된 문자)
            // else 문은 없어도 됨
            else{
                continue;
            }
        }
        return true;
    }
}

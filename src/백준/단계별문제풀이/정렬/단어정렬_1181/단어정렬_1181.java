package 백준.단계별문제풀이.정렬.단어정렬_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
/*
* 1.단어의 갯수 N을 입력받는다.(1<=N<20,000)
* 2.단어를 정렬한다.
*   2-1.길이가 짧은 것부터 정렬한다.
*   2-2.길이가 같으면 사전 순으로 정렬한다.
* 3.정렬된 단어 집합을 출력한다.
*   3-1.중복된 단어가 있으면 중복을 제거하고 한번만 출력한다.
* */
public class 단어정렬_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 단어 갯수
        String[] words = new String[N];

        for(int i=0; i<N; i++){
            words[i] = br.readLine();
        }

        // 문자열을 길이로 오름차순 정렬하기
        Arrays.sort(words, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                if(str1.length() == str2.length())
                    return str1.compareTo(str2);
                else{
                    return str1.length() - str2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(words[0] + "\n");

        for(int i=1; i<N; i++){
            if(!words[i].equals(words[i-1]))
                sb.append(words[i] + "\n");
        }
        System.out.println(sb);
    }
}

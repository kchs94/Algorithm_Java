package 프로그래머스.레벨1;
/*
* spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 존재하면 1, 존재하지 않으면 2
* 찾았는지 확인할 수 있는 버튼을 만드는 게 포인트!
* */
public class 외계어사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        boolean isFind = false;

        for (int i=0; i<dic.length; i++) {
            if (dic[i].length() == spell.length) {  // 길이가 같은가?
                for (String ch : spell) {
                    if (!dic[i].contains(ch)) {
                        isFind = false;
                        break;
                    }
                    isFind = true;
                }
                if (isFind) return 1;
            }
        }
        return answer;
    }
}

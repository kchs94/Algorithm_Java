package 프로그래머스.레벨1;
/*
* 각 spell을 모두 포함하고 spell.lenght와 dic[i]의 길이가 같다면 1 그게아니라면 2
*
* - 길이가 같은가?
* - 각 spell을 모두 포함하는가?
*   - return 1
* - return 2
*
* if 문을 최대한 깔끔하게 하려면 어떻게 해야될까
* */
public class 외계어사전 {
    public int solution(String[] spell, String[] dic) {

        int spellLen = spell.length;
        int dicLen = dic.length;
        for (int i=0; i<dic.length; i++) {
            if (spellLen != dicLen) continue;

            for (int j=0; j<spellLen; j++) {
                if (!dic[i].contains(spell[j])) {
                    break;
                }
            }


        }

        return 2;
    }
}

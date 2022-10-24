package 프로그래머스.레벨1;
/*
* 사냥감의 체력 hp가 입력으로 주어질 때, 사냥감 체력에 딱 맞게 최소한의 병력을 구성하려면 몇마리의 개미가 필요한지 리턴하세요.
* 공격력이 센 개미부터 뽑으면 된다.
* count = 0
* - if (hp == 0) return count
* 1.count += hp/5(장군개미)
* - hp = hp%5
* - if (hp == 0) return count
* 2.count += hp/3(병정개미)
* - hp = hp%3
* - if (hp == 0) return count
* 3.count += hp
* return count;
*
*
* */
public class 개미군단 {
    public int solution(int hp) {
        int count = 0;

        if (hp == 0) return count;
        count += hp/5;
        hp = hp%5;
        if (hp == 0) return count;
        count += hp/3;
        hp = hp%3;
        if (hp == 0) return count;
        count += hp;
        return count;
    }
}

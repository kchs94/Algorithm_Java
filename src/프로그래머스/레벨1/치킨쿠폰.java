package 프로그래머스.레벨1;

/*
 *
 * - int coupon = 0;
 * - int bonus = 0;
 * - int answer = 0;
 *
 * - coupon = chicken;   // 시킨 시킨 후 남은 쿠폰    // 1081
 * - bonus = coupon / 10;   // 보너스 치킨            // 108
 * - answer += bonus;                                 // 108
 * - coupon = coupon % 10; // 남은 쿠폰               // 1
 *
 * - coupon += bonus;   // 보너스 치킨으로 주문 후 받은 쿠폰 추가    // 109
 * - bonus = coupon / 10; // 보너스 치킨                              // 10
 * - answer += bonus;                                                 // 118
 * - coupon = coupon % 10;   // 남은 쿠폰                             // 9
 *
 * - coupon += bonus;   // 보너스 치킨으로 주문 후 받은 쿠폰 추가    // 19
 * - bonus = coupon / 10; // 보너스 치킨                              // 1
 * - answer += bonus;                                                 // 119
 * - coupon = coupon % 10;   // 남은 쿠폰                             // 9
 *
 * - coupon += bonus;   // 보너스 치킨으로 주문 후 받은 쿠폰 추가    // 10
 * - bonus = coupon / 10; // 보너스 치킨                              // 1
 * - answer += bonus;                                                 // 120
 * - coupon = coupon % 10;   // 남은 쿠폰                             // 0
 *
 *
 *
 * */
public class 치킨쿠폰 {
    public int solution(int chicken) {
        int coupon = 0;
        int bonus = 0;
        int answer = 0;

        coupon = chicken;   // 시킨 시킨 후 남은 쿠폰    // 1081
        bonus = coupon / 10;   // 보너스 치킨            // 108
        answer += bonus;                                 // 108
        coupon = coupon % 10; // 남은 쿠폰               // 1

        while (true) {
            coupon += bonus;   // 보너스 치킨으로 주문 후 받은 쿠폰 추가    // 19
            if (coupon < 10) break;
            bonus = coupon / 10; // 보너스 치킨                              // 1
            answer += bonus;                                                 // 119
            coupon = coupon % 10;   // 남은 쿠폰                             // 9
        }


        return answer;
    }
}

package thirtyBythirty;

import java.util.Random;

/**
* @author halfdev
* @since 2020-02-03
* 정수의 합 구하기
* 1. 랜덤숫자 1~50까지 발생시킴
* 2. 1~랜덤숫자 까지의 합계 출력
*/
public class RandomSum {

    // 난수를 생성하는 Method
    private static int random() {
        Random random = new Random();
        return random.nextInt(51); // 0 ~ 50
    }

    public static void main(String[] args) {
        int random = random();
        int sum = 0;

        for (int i = 1; i <= random; i++) {
            sum += i;
        }
        System.out.println("1 부터 " + random + "까지의 합 : " + sum);
    }
}


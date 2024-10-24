package level4.result;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MakeResult {
    private static final int MAX_NUMBER = 9;    // 생성할 숫자의 최대 값 (1~9)


    //증복 없는 결과값 생성
    //digit은 자리수를 의미
    public static int[] resultNumber(int digit) {
        Random random = new Random();
        Set<Integer> numberSet = new HashSet<>();

        while (numberSet.size() < digit) {
            int number = random.nextInt(MAX_NUMBER) + 1;
            numberSet.add(number);
        }

        //Set을 배열로 변환하여 반환
        int[] numberRandom = new int[digit];
        int i = 0;
        for (int num : numberSet) {
            numberRandom[i++] = num;
        }

        return numberRandom;
    }
}

package level1.result;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//결과값을 미리 random하게 생성
public class MakeResult {

    //생성할 숫자의 개수
    private static final Integer MAX_RESULT = 3;
    private static final int MAX_NUMBER = 9;    // 생성할 숫자의 최대 값 (1~9)

    //증복 없는 결과값 생성
    public static int[] resultNumber() {
        Random random = new Random();
        //Set을 사용
        Set<Integer> numberSet = new HashSet<>();

        while (numberSet.size() < MAX_RESULT) {
            // 1~MAX_NUMBER 범위의 숫자 생성
            int number = random.nextInt(MAX_NUMBER) + 1;
            numberSet.add(number);
        }

        //Set을 배열로 변환하여 반환
        int[] numberRandom = new int[MAX_RESULT];
        int i = 0;
        for (int num : numberSet) {
            numberRandom[i++] = num;
        }

        return numberRandom;
    }
}

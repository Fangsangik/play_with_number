package level3.result;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MakeResult {

    private static final Integer MAX_RESULT = 3;
    private static final int MAX_NUMBER = 9;    // 생성할 숫자의 최대 값 (1~9)

    //증복 없는 결과값 생성
    public static int[] resultNumber() {
        Random random = new Random();
        Set<Integer> numberSet = new HashSet<>();

        //set은 idx 값이 0,1,2로 들어가기 때문에 MAX_RESULT = 3
        while (numberSet.size() < MAX_RESULT) {
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

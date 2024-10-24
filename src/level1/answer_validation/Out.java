package level1.answer_validation;

public class Out {
    public static int isOut(int[] numbers, int[] guess) {
        int outCount = 0;

        for (int i = 0; i < guess.length; i++) {
        // 각 guess 값이 numbers 배열에 포함되지 않는 경우 아웃으로 간주
            boolean isOut = true;

            // guess[i] 값이 numbers 배열에 있는지 확인
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == guess[i]) {
                    isOut = false;
                }
            }

            if (isOut) {
                outCount++;
            }
        }
        return outCount;
    }
}

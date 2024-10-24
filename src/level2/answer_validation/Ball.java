package level2.answer_validation;

public class Ball {

    //숫자는 같지만 자리는 다른경우
    public static int isBall(int[] numbers, int[] guessNumber) {
        int ballCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < guessNumber.length; j++) {
                if (i != j && numbers[i] == guessNumber[j]) {
                    ballCount++;
                }
            }
        }

        return ballCount;
    }
}

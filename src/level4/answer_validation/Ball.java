package level4.answer_validation;

public class Ball {

    //숫자는 같지만 자리는 다른경우
    public static int isBall(int[] numbers, int[] guessNumber) {
        int ballCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < guessNumber.length; j++) {
                //같은 자리수 끼리 비교하지 않기 위해
                if (i != j && numbers[i] == guessNumber[j]) {
                    ballCount++;
                }
            }
        }

        return ballCount;
    }
}

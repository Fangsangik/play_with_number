package level3.answer_validation;

//Strike 판별여부
public class Strike {
    // 스트라이크 계산 메서드: 입력 배열과 정답 배열을 비교하여 스트라이크 개수를 반환
    public static int isStrike(int[] numbers, int[] guessNumber) {
        int strikeCount = 0;

        // 입력값과 정답값을 비교하여 같은 자리에 같은 숫자가 있으면 스트라이크 카운트 증가
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == guessNumber[i]) {
                strikeCount++;  // 같은 자리에 같은 숫자가 있으면 스트라이크
            }
        }

        return strikeCount;
    }
}

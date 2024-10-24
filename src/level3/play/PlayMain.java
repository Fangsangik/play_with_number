package level3.play;

import level3.answer_validation.Ball;
import level3.answer_validation.Strike;
import level3.result.GameRecords;
import level3.result.MakeResult;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayMain {
    private static final int IN_PUT_NUMBER = 3;

    public static void playGame(Scanner sc, GameRecords gameRecords) {

        //무작위 수 생성
        int[] randomResultNumber = MakeResult.resultNumber();

        //debug
        for (int numberResult : randomResultNumber) {
            System.out.print(numberResult);
        }
        System.out.println();

        System.out.println("< 게임을 시작합니다 >");

        boolean finished = false;
        int attempts = 0;


        while (!finished) {
            System.out.print("숫자를 입력하세요 : ");
            String input = sc.nextLine();

            attempts++;

            // 일반 숫자로 input 깂을 받으니까 공백이 생겨서 공백이 싫어 char 값으로 변환후 공백을 제거
            // 공백이 있는 경우에도 공백을 제거하고 처리
            input = input.replace(" ", "");

            // 입력 길이가 정확히 3자리인지 확인
            if (input.length() != IN_PUT_NUMBER) {
                System.out.println("잘못된 입력하셨습니다. ");
                continue;
            }

            int[] guessNumber = new int[IN_PUT_NUMBER];

            try {

                validationOfInput(input, guessNumber);

                // 스트라이크와 볼 계산
                int strike = Strike.isStrike(randomResultNumber, guessNumber);
                int ball = Ball.isBall(guessNumber, randomResultNumber);

                System.out.println(strike + "스트라이크" + " " + ball + "볼");

                // 정답을 맞췄을 때
                if (strike == IN_PUT_NUMBER) {
                    System.out.println("정답입니다!");
                    finished = true;
                }

                if (finished) {
                    gameRecords.addRecord(attempts);
                }

            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // 입력된 문자가 숫자가 아니면 예외를 던짐
    private static void validationOfInput(String input, int[] guessNumber) {
        for (int i = 0; i < IN_PUT_NUMBER; i++) {
            int num = Character.getNumericValue(input.charAt(i));
            // 해당 범위의 값을 입력했는지 확인
            if (num < 0 || num > 9) {
                throw new NumberFormatException("숫자가 아닌 문자가 입력되었습니다.");
            }
            guessNumber[i] = num;
        }

        // 모든 숫자를 배열에 채운 후 중복 검사
        if (isDuplicated(guessNumber)) {
            throw new InputMismatchException("중복된 값을 입력했습니다.");
        }
    }


    //중복 방지
    private static boolean isDuplicated(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[i] == numberArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

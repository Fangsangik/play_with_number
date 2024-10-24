package level1.playmain;

import level1.answer_validation.Ball;
import level1.answer_validation.Strike;
import level1.result.MakeResult;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class PlayMain {

    //3자리 수를 미리 상수로 뺌
    private static final int IN_PUT_NUMBER = 3;

    public static void main(String[] args) {

        //결과값 미리 생성
        int[] randomResultNumber = MakeResult.resultNumber();

        //debug용
        for (int numberResult : randomResultNumber) {
            System.out.print(numberResult);
        }
        System.out.println();

        System.out.println("< 게임을 시작합니다 >");
        Scanner sc = new Scanner(System.in);

        //게임이 끝나기 위한 조건
        boolean finished = false;

        while (!finished) {
            System.out.print("숫자를 입력하세요 : ");
            String input = sc.nextLine();

            // 공백이 있는 경우에도 공백을 제거하고 처리
            input = input.replace(" ", "");

            //추측값
            int[] guessNumber = new int[IN_PUT_NUMBER];

            try {

                //입력값이 중복이 아니기 위해 사용
                Set<Integer> uniqueNumbers = new HashSet<>();

                for (int i = 0; i < IN_PUT_NUMBER; i++) {
                    // 입력된 문자가 숫자가 아니면 예외를 던짐
                    int num = Character.getNumericValue(input.charAt(i));
                    if (num < 0 || num > 9) {
                        throw new NumberFormatException("숫자가 아닌 문자가 입력되었습니다.");
                    }
                    guessNumber[i] = num;

                    // 중복된 숫자가 있는지 확인
                    if (!uniqueNumbers.add(num)) {
                        throw new InputMismatchException("중복된 숫자가 입력되었습니다.");
                    }
                }

                // 스트라이크와 볼 계산
                int strike = Strike.isStrike(randomResultNumber, guessNumber);
                int ball = Ball.isBall(guessNumber, randomResultNumber);

                System.out.println(strike + "스트라이크" + " " + ball + "볼");

                // 정답을 맞췄을 때
                if (strike == IN_PUT_NUMBER) {
                    System.out.println("정답입니다!");
                    finished = true;
                }

            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();

    }
}

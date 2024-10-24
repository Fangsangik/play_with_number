package level3.menu;

import level3.play.PlayMain;
import level3.result.GameRecords;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PlayMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameRecords gameRecords = new GameRecords();

        while (true) {
            try {
                System.out.print("환영합니다, 원하시는 번호를 입력해주세요 (1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기) : ");

                if (!sc.hasNextInt()) {
                    System.out.println("유효한 번호를 입력하세요.");
                    sc.next();  // 잘못된 입력 처리
                    continue;
                }

                int menuInput = sc.nextInt();
                sc.nextLine();  // nextInt() 후 남아있는 줄바꿈 문자 처리

                if (menuInput == 1) {
                    System.out.print("게임을 시작합니다. ");
                    PlayMain.playGame(sc, gameRecords);  // 게임 실행
                } else if (menuInput == 2) {
                    System.out.println("<게임 기록 보기>");
                    gameRecords.showRecords();  // 기록 보기
                } else if (menuInput == 3) {
                    System.out.println("종료하기");
                    break;
                } else {
                    System.out.println("잘못 입력했습니다. 다시 입력하세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("유효한 숫자를 입력하세요.");
                sc.nextLine();  // 잘못된 입력을 처리하고 줄바꿈 처리
            } catch (NoSuchElementException e) {
                System.out.println("입력 스트림에 문제가 발생했습니다.");
                break;
            }
        }

        sc.close();
    }
}

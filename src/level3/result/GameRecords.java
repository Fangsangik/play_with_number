package level3.result;

import java.util.ArrayList;
import java.util.List;

public class GameRecords {

    List<Integer> attemptHistory = new ArrayList<>();  // 시도 횟수 저장

    // 시도 횟수를 기록하는 메서드
    public void addRecord(int attempt) {
        attemptHistory.add(attempt);  // 시도 횟수 저장
    }

    // 시도 횟수 기록 보기
    public void showRecords() {
        if (attemptHistory.isEmpty()) {
            System.out.println("기록이 없습니다.");
            return;
        }

        // 시도 횟수만 출력
        for (int i = 0; i < attemptHistory.size(); i++) {
            System.out.println((i + 1) + "번째 게임 : 시도횟수 - " + attemptHistory.get(i) + "회");
        }
    }
}
package baseball.view;

import baseball.domain.Score;

import java.util.Scanner;

public class GameView {
    private static final String PLEASE_INPUT_NUMBERS = "숫자를 입력해주세요 : ";

    private static final String NOTHING = "낫싱\n";
    private static final String BALL_COUNT = "%d볼\n";
    private static final String STRIKE_COUNT = "%d스트라이크\n";
    private static final String STRIKE_AND_BALL_COUNT = "%d볼 %d스트라이크\n";

    private GameView() {
    }

    public static String inputNumbers(Scanner scanner) {
        System.out.print(PLEASE_INPUT_NUMBERS);
        return scanner.nextLine();
    }

    public static void printScore(Score score) {
        if (score.isZeroBall() && score.isZeroStrike()) {
            System.out.print(NOTHING);
        } else if (score.isZeroStrike()) {
            System.out.format(BALL_COUNT, score.getBall());
        } else if (score.isZeroBall()) {
            System.out.format(STRIKE_COUNT, score.getStrike());
        } else {
            System.out.format(STRIKE_AND_BALL_COUNT, score.getBall(), score.getStrike());
        }
    }
}

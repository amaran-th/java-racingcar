package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputView {

  private static final int MAX_TRIAL_NUM = 2;
  private static final int MIN_CAR_NAME_LENGTH = 1;
  private static final int MAX_CAR_NAME_LENGTH = 5;
  private static final Scanner scanner = new Scanner(System.in);
  private static final Pattern NUMBER = Pattern.compile("[0-9]+");

  private InputView() {
  }

  public static List<String> readCarNames() {
    System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    String[] split = scanner.nextLine().split(",");

    return Arrays.stream(split)
        .peek(InputView::validateCarName)
        .collect(Collectors.toList());
  }

  private static void validateCarName(String inputCarName) {
    if (inputCarName.length() < MIN_CAR_NAME_LENGTH
        || inputCarName.length() > MAX_CAR_NAME_LENGTH) {
      throw new IllegalArgumentException("자동차의 이름의 길이는 1 이상 5 이하여아 한다");
    }
  }

  public static int readTrialNum() {
    System.out.println("시도할 횟수는 몇회인가요?(단, 100회 미만이어야 합니다)");
    String input = scanner.nextLine();
    validateTrialNum(input);
    return Integer.parseInt(input);
  }

  private static void validateTrialNum(String input) {
    validateOnlyNum(input);
    validateTrialMaxNum(input);
  }

  private static void validateTrialMaxNum(String input) {
    if (input.length() > MAX_TRIAL_NUM) {
      throw new IllegalArgumentException("이동 횟수는 100회 미만이어야 합니다.");
    }
  }

  private static void validateOnlyNum(String input) {
    boolean isNumber = !NUMBER.matcher(input).matches();
    if (isNumber) {
      throw new IllegalArgumentException("이동 횟수는 숫자여야 합니다.");
    }
  }

}

package ishestakov.task18v2;

import java.util.Scanner;

public class Main {

    static final String ANSWER = "Заархивированный вирус";
    static int count = 3;

    static void GameIntro() {
        System.out.println("Отгадайте загадку:" +
                "\nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает" +
                "\n==================================================================");
    }

    static void Game() {
        while (true) {
            if (count == 0) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            } else {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                if (str.equals(ANSWER)) {
                    System.out.println("Правильно!");
                    break;
                } else if (str.equals("Подсказка") && count == 3) {
                    System.out.println("Подсказка: ты узнаешь его по сигнатурному анализу" +
                            "\nВсе попытки обменялись на подсказку. Ваш ответ: ");
                    str = scanner.nextLine();
                    if (str.equals(ANSWER)) {
                        System.out.println("Правильно!");
                    } else {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                    break;
                } else if (str.equals("Подсказка") && count != 3) {
                    System.out.println("Подсказка уже недоступна");
                } else {
                    if (count != 1) System.out.println("Подумай еще!");
                    count--;
                }
            }
        }
    }

    public static void main(String[] args) {

        GameIntro();
        Game();

    }

}


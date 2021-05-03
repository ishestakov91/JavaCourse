package ishestakov.task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String ANSWER = "Заархивированный вирус";
        int count = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Отгадайте загадку: " +
                "\nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает" +
                "\n==================================================================");

        System.out.println("Осталось " + count + " попытки. Ваш ответ:");
        String str3 = scanner.nextLine();

        if (str3.equals("Подсказка")) {
            System.out.println("Подсказка: ты узнаешь его по сигнатурному анализу");
            System.out.println("Все попытки обменялись на подсказку. Ваш ответ: ");
            String hint = scanner.nextLine();

            if (hint.equals(ANSWER)) {
                System.out.println("Правильно!");
            } else
            {
                System.out.println("Обидно, приходи в другой раз");
            }
            System.exit(0);
        }

        if (str3.equals(ANSWER)) {
            System.out.println("Правильно! Вы угадали с 1 попытки!");
            System.exit(0);

        } else {

                System.out.println("Подумай еще!");
                count--;
                System.out.println("Осталось " + count + " попытки. Ваш ответ:");
                String str2 = scanner.nextLine();

                if (str2.equals("Подсказка")) {
                    System.out.println("Подсказка уже недоступна. Ваш ответ:");
                    str2 = scanner.nextLine();
                }

                if (str2.equals(ANSWER)) {
                    System.out.println("Правильно! Вы угадали со 2 попытки!");
                    System.exit(0);
                }

                else {

                    System.out.println("Подумай еще!");
                    count--;
                    System.out.println("Осталась " + count + " попытка. Ваш ответ:");
                    String str1 = scanner.nextLine();

                    if (str1.equals("Подсказка")) {
                        System.out.println("Подсказка уже недоступна. Ваш ответ:");
                        str1 = scanner.nextLine();
                    }

                    if (str1.equals(ANSWER)) {
                        System.out.println("Правильно! Вы угадали с 3 попытки!");
                        System.exit(0);
                    } else {
                        System.out.println("Обидно, приходи в другой раз");
                    }

                }
            }

    }
}

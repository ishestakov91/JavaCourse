package ishestakov.task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double course, rub, usd;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текущий курс доллара к рублю: ");
        course = scanner.nextDouble();

        System.out.println("Введите количество рублей: ");
        rub = scanner.nextDouble();

        usd = rub / course;

        System.out.printf("\nКурс доллара: %.2f\n", course);
        System.out.printf("Количество рублей: %.2f\n", rub);
        System.out.printf("Количество долларов: %.2f\n", usd);

    }
}

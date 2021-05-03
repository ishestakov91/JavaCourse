package ishestakov.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str;
        int a, b, max, min;
        double min_double;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число с клавиатуры для записи в строковую переменную");
        str = scanner.next();
        b = Integer.parseInt(str);

        System.out.println("Введите второе число с клавиатуры для записи в целочисленную переменную");
        a = scanner.nextInt();

        System.out.println();
        if (a > b) {
           max = a;
           min = b;
        }
        else {
            max = b;
            min = a;
        }

        min_double = min;

        System.out.println("Большее число: " + max);
        System.out.println("Меньшее число: " + min_double);



    }
}

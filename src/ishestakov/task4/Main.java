package ishestakov.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x,y,z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число x:");
        x = scanner.nextDouble();
        System.out.println("Введите число y:");
        y = scanner.nextDouble();
        System.out.println("Введите число z:");
        z = scanner.nextDouble();

        double av = (x + y + z)/3;
        System.out.println("Среднее арифметическое x,y,z: " + av);

        double av2 = Math.floor(av / 2);
        if (av2 > 3) System.out.println("Программа выполнена корректно");

    }
}

package ishestakov.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b;
        String op;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число a: ");
        a = scanner.nextDouble();
        System.out.println("Введите число b: ");
        b = scanner.nextDouble();

        System.out.println("Введите знак арифметической операции: ");
        op = scanner.next();

        switch (op) {
            case "+":
                System.out.print("Сумма чисел: ");
                System.out.print(a + b);
                break;
            case "-":
                System.out.print("Разность чисел: ");
                System.out.println(a - b);
                break;
            case "*":
                System.out.print("Произведение чисел: ");
                System.out.println(a * b);
                break;
            case "/":
                System.out.print("Частное чисел: ");
                System.out.println(a / b);
                break;
            default:
                System.out.println("Неизвестная операция");
                break;

        }


    }
}

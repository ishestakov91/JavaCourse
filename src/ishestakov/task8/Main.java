package ishestakov.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число n:");

        n = scanner.nextInt();
        a = 0;

        for (int i = 1; i <= n; i++) {
            if (!(i % 2 == 0)) a = a + i;
        }

        System.out.println("Сумма всех нечетных чисел от 1 до числа n (включительно): " + a);

    }
}

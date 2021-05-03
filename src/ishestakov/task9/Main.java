package ishestakov.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        double sum = 0,avr;

        System.out.println("Введите размерность массива");
        size = scanner.nextInt();
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение элемента массива с индексом " + i);
            array[i] = scanner.nextDouble();
            sum = sum + array[i];
        }

        avr = sum / size;

        System.out.println("\nСписок всех элементов массива, умноженный на среднее арифметическое его значений:");
        for (double val: array) {
            System.out.println(val * avr);
        }




    }
}

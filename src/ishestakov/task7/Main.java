package ishestakov.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double X = 22.2;
        final double Y = 17.9;
        final double Z = 0.0;

        Scanner scanner = new Scanner(System.in);
        int size, counter = 0;
        double val;

        System.out.println("Введите размерность массива");
        size = scanner.nextInt();
        double[] array = new double[size];

        for(int i = 0; i < size; i++) {
            System.out.println("Введите значение элемента массива с индексом " + i);
            array[i] = scanner.nextDouble();
        }

        for(double j: array) {
            if (j == X | j == Y | j == Z) {
                counter++;
            }
        }

        if (counter > 0) System.out.println("Данное значение имеется в константах");


    }
}

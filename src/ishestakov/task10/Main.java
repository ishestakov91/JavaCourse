package ishestakov.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b;

        System.out.println("Введите количество строк матрицы: ");
        a = scanner.nextInt();

        System.out.println("Введите количество столбцов матрицы: ");
        b = scanner.nextInt();

        int[][] array = new int[a][b];

        for(int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Введите значение для элемента матрицы [" + i +"][" + j +"]");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Вывод первой строки матрицы с умножением каждого элемента на 3: ");
        for (int i = 0; i < b; i++) {
            System.out.print(array[0][i] * 3 + " ");
        }


    }
}

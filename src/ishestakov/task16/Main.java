package ishestakov.task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int res = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();

        if (array[0] == 'x') {
            switch (array[1]) {
                case '+':
                    res = Character.getNumericValue(array[4]) - Character.getNumericValue(array[2]);
                    break;
                case '-':
                    res = Character.getNumericValue(array[4]) + Character.getNumericValue(array[2]);
                    break;
            }
        }

        if (array[2] == 'x') {
            switch (array[1]) {
                case '+':
                    res = Character.getNumericValue(array[4]) - Character.getNumericValue(array[0]);
                    break;
                case '-':
                    res = Character.getNumericValue(array[0]) - Character.getNumericValue(array[4]);
                    break;
            }
        }

        if (array[4] == 'x') {
            switch (array[1]) {
                case '+':
                    res = Character.getNumericValue(array[0]) + Character.getNumericValue(array[2]);
                    break;
                case '-':
                    res = Character.getNumericValue(array[0]) - Character.getNumericValue(array[2]);
                    break;
            }
        }

        System.out.println("Неизвестное x = " + res);

    }
}

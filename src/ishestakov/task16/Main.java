package ishestakov.task16;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int res = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();

        if (array[0] == 'x') {
            switch(array[1]) {
                case '+':
                    res = Character.getNumericValue(array[4]) - Character.getNumericValue(array[2]);
                    break;
                case '-':
                    res = Character.getNumericValue(array[4]) + Character.getNumericValue(array[2]);
                    break;
                default:
                    break;
            }
        }

        if (array[2] == 'x') {
            switch(array[1]) {
                case '+':
                    res = Character.getNumericValue(array[4]) - Character.getNumericValue(array[0]);
                    break;
                case '-':
                    res = Character.getNumericValue(array[0]) - Character.getNumericValue(array[4]);
                    break;
                default:
                    break;
            }
        }

        if (array[4] == 'x') {
            switch(array[1]) {
                case '+':
                    res = Character.getNumericValue(array[0]) + Character.getNumericValue(array[2]);
                    break;
                case '-':
                    res = Character.getNumericValue(array[0]) - Character.getNumericValue(array[2]);
                    break;
                default:
                    break;
            }
        }

        System.out.println("Неизвестное x = " + res);

    }
}

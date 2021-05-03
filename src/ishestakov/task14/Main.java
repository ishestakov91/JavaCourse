package ishestakov.task14;

import java.util.Random;

public class Main {

    public static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {

        int array[] = new int[15];
        int max, min;

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(-20, 20);
        }

        max = array[0];
        min = array[0];

        for (int j : array) {
            if (j > max) max = j;
            if (j < min) min = j;
        }

        System.out.println("Максимальный элемент массива: " + max + ", минимальный элемент массива: " + min);

        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Из максимального и минимального наибольшее по модулю максимальное: " + max);
        } else if (Math.abs(max) == Math.abs(min)) {
            System.out.println("Из максимального и минимального по модулю оба числа равны: " + max + " и " + min);
        } else {
            System.out.println("Из максимального и минимального наибольшее по модулю минимальное: " + min);
        }
    }
}

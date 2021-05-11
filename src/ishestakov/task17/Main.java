package ishestakov.task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int num = Integer.parseInt(scanner.nextLine());

        String[] lines = new String[num];
        int res[] = new int[num];
        int res_max;
        int count;

        for (int i = 0; i < num; i++) {
            System.out.println("Введите строку " + (i + 1) + ":");
            lines[i] = scanner.nextLine();
            res[i] = (int) lines[i]
                    .chars()
                    .distinct()
                    .count();
        }

        res_max = res[0];
        count = 0;

        for (int i = 1; i < res.length; i++) {
            if (res_max < res[i]) {
                res_max = res[i];
                count = i;
            }
        }

        System.out.println("Ответ: " + lines[count]);

    }
}

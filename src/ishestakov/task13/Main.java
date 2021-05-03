package ishestakov.task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str;
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("Введите строку: ");
        str = scanner.nextLine();

        String[] str_arr = str.split(" ");

        System.out.println("\nСписок слов, состоящих только из латиницы: ");
        for(String s: str_arr) {
            s = s.replaceAll(".*[^A-z]+.*","");
            if (!s.equals("")) {
                System.out.println(s);
                counter++;
            }

        }

        if (counter == 0) {
            System.out.println("таких слов в строке 0");
        } else {
            System.out.println("\nКоличество слов, состоящих только из латиницы: " + counter);
        }




    }
}

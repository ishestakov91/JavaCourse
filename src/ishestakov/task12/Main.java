package ishestakov.task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int counter = 0;

       System.out.println("Введите строку: ");

       String str = scanner.nextLine();

       if (str.contains("Java")) {
           System.out.println("Введённая строка содержит подстроку \"Java\"");
           counter++;
       } else {
           System.out.println("Введённая строка не содержит подстроку \"Java\"");
       }

        if (str.startsWith("I like")) {
            counter++;
            System.out.println("Введённая строка начинается с подстроки \"I like\"");
        } else {
            System.out.println("Введённая строка не начинается с подстроки \"I like\"");
        }

        if (str.endsWith("!!!")) {
            counter++;
            System.out.println("Введённая строка заканчивается подстрокой \"!!!\"");
        } else {
            System.out.println("Введённая строка не заканчивается подстрокой \"!!!\"");
        }

        if (counter == 3) {
            System.out.println(str.toUpperCase());
        }

        str = str.replaceAll("a","o");
        str = str.substring(7,11);
        System.out.println(str);

    }
}

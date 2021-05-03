package ishestakov.task6;

import java.util.Scanner;

public class Main {

    public static void printWeight(double kg, double pood, double pound, double oz) {
        System.out.println("Результат: \n Килограммы: " + kg + "\n Пуды: " + pood + "\n Фунты: " + pound +
                "\n Унции: " + oz);
    }

    public static void printDistance(double m, double mile, double yard, double foot) {
        System.out.println("Результат: \n Метры: " + m + "\n Мили: " + mile + "\n Ярды: " + yard +
                "\n Футы: " + foot);
    }

    public static void main(String[] args) {

        int choice1, choice2;
        double value, kg, pood, pound, oz, m, mile, yard, foot;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите, что переводить: 1 - масса, 2 - расстояние");
        choice1 = scanner.nextInt();

        if (choice1 == 1) {

            System.out.println("Выберите единицу измерения массы: 1 - килограмм, 2 - пуд, 3 - фунт, 4 - унция");
            choice2 = scanner.nextInt();

            if (choice2 == 1 | choice2 == 2 | choice2 == 3 | choice2 == 4) {

                System.out.println("Введите значение");
                value = scanner.nextDouble();

                switch (choice2) {
                    case 1:
                        kg = value;
                        pood = kg * 0.061048;
                        pound = kg * 2.2;
                        oz = kg * 35.27;
                        printWeight(kg, pood, pound, oz);
                        break;
                    case 2:
                        pood = value;
                        kg = pood * 16.38;
                        pound = pood * 36.11;
                        oz = pood * 577.79;
                        printWeight(kg, pood, pound, oz);
                        break;
                    case 3:
                        pound = value;
                        kg = pound * 0.45;
                        pood = pound * 0.028;
                        oz = pound * 16;
                        printWeight(kg, pood, pound, oz);
                        break;
                    case 4:
                        oz = value;
                        kg = oz * 0.028;
                        pood = oz * 0.0017;
                        pound = oz * 0.063;
                        printWeight(kg, pood, pound, oz);
                        break;
                    default:
                        break;
                }

            } else {
                System.out.println("Некорректное значение единицы измерения. Нужно выбрать 1, 2, 3 или 4");
            }

        } else if (choice1 == 2) {

            System.out.println("Выберите единицу измерения длины: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            choice2 = scanner.nextInt();

            if (choice2 == 1 | choice2 == 2 | choice2 == 3 | choice2 == 4) {

                System.out.println("Введите значение");
                value = scanner.nextDouble();

                switch (choice2) {
                    case 1:
                        m = value;
                        mile = m * 0.00062;
                        yard = m * 1.09;
                        foot = m * 3.28;
                        printDistance(m, mile, yard, foot);
                        break;
                    case 2:
                        mile = value;
                        m = mile * 1609.34;
                        yard = mile * 1760;
                        foot = mile * 5280;
                        printDistance(m, mile, yard, foot);
                        break;
                    case 3:
                        yard = value;
                        m = yard * 0.91;
                        mile = yard * 0.00057;
                        foot = yard * 3;
                        printDistance(m, mile, yard, foot);
                        break;
                    case 4:
                        foot = value;
                        m = foot * 0.3;
                        mile = foot * 0.00019;
                        yard = foot * 0.33;
                        printDistance(m, mile, yard, foot);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Некорректное значение единицы измерения. Нужно выбрать 1, 2, 3 или 4");
            }

        } else {
            System.out.println("Неизвестный вариант, пожалуйста введите число 1 или 2");
        }


    }
}

package ishestakov.task3;

public class Main {
    public static void main(String[] args) {

        int[] array = {3,4,8,1,7};

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        int sum = array[0] + array[array.length - 3];
        System.out.print("Сумма первого и среднего элементов: " + sum);
    }
}

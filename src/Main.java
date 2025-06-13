import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println(" _____ Задача 1 _____");
        //int[] expenses = {105_489, 128_011, 92_127, 178_989, 134_256};
        int[] expenses = generateRandomArray(); // Массив со случайными числами
        int sumExpenses = 0;
        //System.out.println(Arrays.toString(expenses));
        for (int item : expenses) {
            sumExpenses += item;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей%n", sumExpenses);

        // Task 2
        System.out.println(" _____ Задача 2 _____");
        expenses = generateRandomArray();   // Создаём новый массив со случайными числами
        //System.out.println(Arrays.toString(expenses));
        int minExpenses = expenses[0];
        int maxExpenses = expenses[0];
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная " +
                "сумма трат за неделю составила %d, рублей%n", minExpenses, maxExpenses);

        // Task 3
        System.out.println(" _____ Задача 3 _____");
        expenses = generateRandomArray();   // Создаём новый массив со случайными числами
        double meanValue;
        sumExpenses = 0;
        //System.out.println(Arrays.toString(expenses));
        for (int item : expenses) {
            sumExpenses += item;
        }
        meanValue = (double) sumExpenses / expenses.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", meanValue);

        // Task 4
        System.out.println(" _____ Задача 4 _____");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        /*
        String strFullName = "";
        for (int i = reverseFullName.length - 1; i > -1; i--){
            strFullName = strFullName + reverseFullName[i];
        }
        System.out.println(strFullName);
        */
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    // Создание случайных затрат
    public static int[] generateRandomArray() {
        int size = (int) (Math.random() * 2 + 4);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 150_000 + 80_000);
        }
        return array;
    }
}
package com.skypro.homework_9;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] arr = generateRandomArray();
        int maxSalary = -1; // Взяли значение меньше любого значения в массиве
        int minSalary;
        for (final int current : arr) {
            if (current > maxSalary) {
                maxSalary = current;
            }
        }
        minSalary = maxSalary; // Присвоили минимальному значению самое максимольное и запускаем цикл.
        for (final int current : arr) {
            if (current < minSalary) {
                minSalary = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSalary + " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] arr = generateRandomArray();
        double sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.printf("Средняя сумма трат за месяц составила  %.2f рублей.%n", sum / arr.length);
    }

    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

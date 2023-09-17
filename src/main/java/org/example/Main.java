package org.example;

import java.util.Scanner;

public class Main {
    public static void input(int[] arrayOfElements, int count) {
        int element;
        Scanner scannerNumber = new Scanner(System.in);
        for (int j = 0; j < count; j++) {
            element = scannerNumber.nextInt();
            arrayOfElements[j] = element;
        }
    }

    public static float average(int[] arrayOfElements, int count) {
        int summa = 0;
        float average = 0;
        for (int j = 0; j < count; j++) {
            summa += arrayOfElements[j];
        }
        return (float) summa / count;
    }

    public static float averageEvenNumbers(int[] arrayOfElements, int count) {
        int summa = 0;
        int i = 0;
        for (int j = 0; j < count; j++) {
            if (arrayOfElements[j] % 2 == 0) {
                summa += arrayOfElements[j];
                i++;
            }
        }
        return  (float) summa / i;
    }

    public static void main(String[] args) {
        int count;
        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите ввести?");
        count = scannerNumber.nextInt();
        System.out.println("Введите не более " + count + " чисел");
        int[] massiveElements = new int[count];
        input(massiveElements, count);
        System.out.println("Среднее арифметическое вашего ввода = " + average(massiveElements, count));
        System.out.println("Среднее арифметическое четных чисел вашего ввода = " + averageEvenNumbers(massiveElements, count));
    }
}
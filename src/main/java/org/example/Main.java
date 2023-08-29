package org.example;


import java.util.Scanner;

public class Main {
    public static void Input(int[] massiveElements, int count){
        int element;
        Scanner scannerNumber = new Scanner(System.in);
        for (int j = 0; j < count; j++){
            element = scannerNumber.nextInt();
            massiveElements[j] = element;
        }
    }

    public static float Average(int[] massiveElements, int count){
        int summa = 0;
        float average = 0;
        for (int j = 0; j < count; j++){
            summa += massiveElements[j];
        }
        average = (float)summa/count;
        return average;
    }

    public static float AverageEvenNumbers(int[] massiveElements, int count){
        int summa = 0;
        int iterator = 0;
        float averageEvenNumbers = 0;
        for (int j = 0; j < count; j++) {
            if (massiveElements[j] % 2 == 0) {
                summa += massiveElements[j];
                iterator++;
            }
        }
        averageEvenNumbers = (float)summa/iterator;
        return averageEvenNumbers;
    }
    public static void main(String[] args) {
        int count;
        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите ввести?");
        count = scannerNumber.nextInt();
        System.out.println("Введите не более " + count + " чисел");
        int[] massiveElements = new int[count];
        Input(massiveElements, count);
        System.out.println("Среднее арифметическое вашего ввода = " + Average(massiveElements, count));
        System.out.println("Среднее арифметическое четных чисел вашего ввода = " + AverageEvenNumbers(massiveElements, count));
    }
}
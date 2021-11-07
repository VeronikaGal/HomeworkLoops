package com.galeeva.homeworkLoops;

/*Посчитать четные и нечетные цифры целого числа и вывести их на консоль
        Для решения написать 2 функции, которые будут принимать введенное целое число,
        а возвращать количество четных цифр (вторая функция - нечетных).
        Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();
        even(value);
        odd(value);
    }

    public static void even(int value) {
        int result = 0;
        int n = 0;
        for (int i = value; i != 0; i /= 10) {
            result = i % 10;
            if (result % 2 == 0) {
                n++;
            }
        }
        System.out.println("Even: " + n);
    }

    public static void odd(int value) {
        int result;
        int n = 0;
        for (int i = value; i != 0; i /= 10) {
            result = i % 10;
            if (!(result % 2 == 0)) {
                n++;
            }
        }
        System.out.println("Odd: " + n);
    }
}

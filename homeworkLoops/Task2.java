package com.galeeva.homeworkLoops;

/*Дано целое число.
        Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
        Результат вывести на консоль.
        Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
        Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)*/

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();
        int result=contrary(value);
        System.out.println(result);
    }

    public static int contrary(int value) {
        int result = 0;
        while (value != 0) {
            result = result * 10;
            result = result + value % 10;
            value = value / 10;
        }
        return result;
    }
}

package task.task1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Инициализировать две переменные
 * 2. Присвоить им значение(реализовать считывание с клавиатуры строки, преобразование в int)
 * 3. Написать методы которые производят операции:
 * сложение/вычитание/умножение/деление/деление остатока от двух
 */

public class JavaBasicOne6 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first number");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Input second number");
        int b = Integer.parseInt(br.readLine());

        JavaBasicOne6 javaBasicSix = new JavaBasicOne6();

        System.out.println("125 + 24 = " + javaBasicSix.sum(a, b));
        System.out.println("125 - 24 = " + javaBasicSix.multiply(a, b));
        System.out.println("125 * 24 = " + javaBasicSix.subtract(a, b));
        System.out.println("125 / 24 = " + javaBasicSix.divide(a, b));
        System.out.println("125 mod 24 = " + javaBasicSix.remainder(a, b));
    }

    private int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    private int multiply(int a, int b) {
        int c = a - b;
        return c;
    }

    private int subtract(int a, int b) {
        int c = a * b;
        return c;
    }

    private int divide(int a, int b) {
        int c = a / b;
        return c;
    }

    private int remainder(int a, int b) {
        int c = a % b;
        return c;
    }
}

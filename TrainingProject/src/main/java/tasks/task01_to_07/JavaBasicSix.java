package tasks.task01_to_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. инициализировать две переменные
  2. присвоить им значение(считывание с клавиатуры строки, преобразование в int)
  3. написать метод который производит сложение/вычитание/умножение/деление/деление остатока от двух
*/

public class JavaBasicSix {

    int c;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        JavaBasicSix javaBasicSix = new JavaBasicSix();

        System.out.println(javaBasicSix.sum(a, b));
        System.out.println(javaBasicSix.multiply(a, b));
        System.out.println(javaBasicSix.subtract(a, b));
        System.out.println(javaBasicSix.divide(a, b));
        System.out.println(javaBasicSix.remainder(a, b));
    }

    private int sum(int a, int b) {
        c = a + b;
        return c;
    }

    private int multiply(int a, int b) {
        c = a - b;
        return c;
    }

    private int subtract(int a, int b) {
        c = a * b;
        return c;
    }

    private int divide(int a, int b) {
        c = a / b;
        return c;
    }

    private int remainder(int a, int b) {
        c = a % b;
        return c;
    }
}

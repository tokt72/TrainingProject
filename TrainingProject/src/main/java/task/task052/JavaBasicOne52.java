package task.task052;

/*1. Инциализировать две переменные, которые принимают ввод целых чисел с клавиатуры
 *2. Создать метод, который возвращает true в случае если сумма двух введенных чисел равна третьему
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasicOne52 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input the first number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Input the second number:");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Input the third number:");
        int c = Integer.parseInt(br.readLine());

        JavaBasicOne52 javaBasicOne52 = new JavaBasicOne52();
        System.out.println("The result is: " + javaBasicOne52.getTrueResult(a, b, c));
    }

    private Boolean getTrueResult(int a, int b, int c) {
        return (a + b) == c;
    }
}

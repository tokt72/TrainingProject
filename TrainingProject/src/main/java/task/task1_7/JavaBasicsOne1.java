package task.task1_7;

/**
 * 1. Инициализировать переменную
 * 2. Реализовать считывание с клавиатуры строки
 * 3. Вывести на экран Hello + Введеное текстовое значение(в данном случае имя), вывести с новой строки
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasicsOne1 {

    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println("Hello " + "\n" + name);

    }

}

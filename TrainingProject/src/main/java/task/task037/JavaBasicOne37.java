package task.task037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Инициализировать переменную
 * 2. Присвоить ей значение(считывание с клавиатуры строки)
 * 3. Введите предложение
 * 4. Выведите это предложением в обратном порядке
 */

public class JavaBasicOne37 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Reverse string:");
        char[] valueMas = br.readLine().toCharArray();

        for (int i = valueMas.length - 1; i >= 0; i--) {
            System.out.print(valueMas[i]);
        }
    }
}

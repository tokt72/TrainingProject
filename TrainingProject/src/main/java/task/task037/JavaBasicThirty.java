package task.task037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    1. инициализировать переменную
    2. присвоить ей значение(считывание с клавиатуры строки)
    3. Введите предложение
    4. Выведите это предложением в обратном порядке(каждая буква с новой строки)
 */

public class JavaBasicThirty {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] valueMas = br.readLine().toCharArray();

        for (int i = valueMas.length - 1; i >= 0; i--) {
            System.out.println(valueMas[i]);
        }
    }
}

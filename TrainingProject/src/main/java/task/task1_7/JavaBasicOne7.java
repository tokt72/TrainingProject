package task.task1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. Инициализировать переменную
  2. Присвоить ей значение(реализовать считывание с клавиатуры строки, преобразование в int)
  3. Написать метод который производит умножение заданного числа от 1 до 10
  4. Вывести результат на экран
*/

public class JavaBasicOne7 {

    int c;

    public static void main(String args[]) throws IOException {

        JavaBasicOne7 javaBasicSeven = new JavaBasicOne7();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        javaBasicSeven.subtractValueFrom1To10(a);
    }

    int subtractValueFrom1To10(int a) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
        return c;
    }
}

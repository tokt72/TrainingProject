package tasks.task01_to_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. инициализировать переменную
  2. присвоить ей значение(считывание с клавиатуры строки, преобразование в int)
  3. написать метод который производит сложение/вычитание/умножение/деление/деление остатока от двух и выводит на экран
*/

public class JavaBasicSeven {

    int c;

    public static void main(String args[]) throws IOException {

        JavaBasicSeven javaBasicSeven = new JavaBasicSeven();
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

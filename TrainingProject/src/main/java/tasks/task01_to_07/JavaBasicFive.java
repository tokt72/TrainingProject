package tasks.task01_to_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. инициализировать две переменные
  2. присвоить им значение(считывание с клавиатуры строки, преобразование в int)
  3. написать метод который производит умножение
*/
public class JavaBasicFive {

    int c;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        JavaBasicFive javaBasicFive = new JavaBasicFive();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(javaBasicFive.subtract(a, b));
    }

    private int subtract(int a, int b) {
        c = a * b;
        return c;
    }
}

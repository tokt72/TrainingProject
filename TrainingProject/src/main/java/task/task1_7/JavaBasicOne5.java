package task.task1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. Инициализировать две переменные
  2. Присвоить им значение(реазиловать считывание с клавиатуры строки, преобразование в int)
  3. Написать метод который производит умножение
  4. Вывести результат операции в консоль
*/
public class JavaBasicOne5 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        JavaBasicOne5 javaBasicFive = new JavaBasicOne5();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(javaBasicFive.subtract(a, b));
    }

    private int subtract(int a, int b) {
        int c = a * b;
        return c;
    }
}

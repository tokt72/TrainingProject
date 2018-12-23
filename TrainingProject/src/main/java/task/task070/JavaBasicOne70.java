package task.task070;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 1. Инициализировать две переменных типа String которые принимают на вход вводимый текст.
 *  2. Написать метод, который принимает на вход значения этих переменных и
 *  сравнивает колличество символов. Строки не должны иметь одинаковую дилнну
 *  Пример вывода двух строк: "short_string + long_string + short_string"
 * */

public class JavaBasicOne70 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Test Data: ");
        String text1 = br.readLine();
        String text2 = br.readLine();

        JavaBasicOne70 javaBasicOne70 = new JavaBasicOne70();
        javaBasicOne70.getFullText(text1, text2);
    }

    private void getFullText(String text1, String text2) {

        if (text1.length() <= text2.length()) {
            System.out.println(text1 + text2 + text1);

        } else System.out.println(text2 + text1 + text2);
    }
}

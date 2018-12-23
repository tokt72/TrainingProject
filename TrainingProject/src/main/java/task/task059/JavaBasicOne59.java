package task.task059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Инициализировать переменную типа String которая принимает на вход вводимый текст.
 * 2. Написать метод который принимает на выход
 * String и во всех словах переводит все заглавные буквы в нижний регистр
 */

public class JavaBasicOne59 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a String: ");
        String text = br.readLine();
        JavaBasicOne59 javaBasicOne59 = new JavaBasicOne59();
        System.out.println(javaBasicOne59.toUpperCaseLetter(text));
    }

    private String toUpperCaseLetter(String text) {
        StringBuilder builder = new StringBuilder(text);
        return builder.toString().toLowerCase();
    }
}

package task.task061;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Инициализировать переменную типа String которая принимает на вход вводимый текст.
 * 2. Написать метод который принимает на выход
 * String и во всех словах переводит все заглавные буквы в нижний регистр
 */

public class JavaBasicOne61 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a String: ");
        String text = br.readLine();

        JavaBasicOne61 javaBasicOne61 = new JavaBasicOne61();
        System.out.println(javaBasicOne61.reverseStringWithCharAt(text));
    }

    private String reverseStringWithCharAt(String text) {
        int stringLength = text.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = text.charAt(i) + result;
        }
        return result;
    }
}

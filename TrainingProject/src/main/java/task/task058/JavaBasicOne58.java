package task.task058;

/*  1. Инициализировать переменную String которая принимает на вход вводимый текст.
 *  2. Написать метод который принимает на выход String и первую букву каждого слова
 *  переводит в верхний регистр
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasicOne58 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        JavaBasicOne58 javaBasicOne58 = new JavaBasicOne58();
        System.out.println(javaBasicOne58.toUpperCaseForFirstLetter(text));
    }

    private String toUpperCaseForFirstLetter(String text) {

        StringBuilder builder = new StringBuilder(text);
        if (Character.isAlphabetic(text.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));

        for (int i = 1; i < text.length(); i++)
            if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));

        return builder.toString();
    }
}

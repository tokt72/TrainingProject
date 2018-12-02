package task.task038;

/**
 * 1. Инициализировать символьный массив
 * 2. Реализовать запись значений в этот массив
 * с клавиатуры(перобразовать записываемое значение в из String в Char)
 * 3. Инициализировать переменные
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaBasicOne38 {

    public static void main(String[] args) throws IOException {


        JavaBasicOne38 javaBasicThirtyEight = new JavaBasicOne38();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        javaBasicThirtyEight.countValue(text);

    }

    public void countValue(String text) {

        char[] value = text.toCharArray();

        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < text.length(); i++) {

            if (Character.isLetter(value[i])) {
                letter++;
            } else if (Character.isDigit(value[i])) {
                num++;
            } else if (Character.isSpaceChar(value[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
}

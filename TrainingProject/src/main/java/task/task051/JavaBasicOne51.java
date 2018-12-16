package task.task051;

/*1. Инициализировать переменную которая принимает ввод строки с клавиатуры
 *2. Написать метод который принимает строку и приобразовывает в число
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasicOne51 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();

        JavaBasicOne51 javaBasicOne51 = new JavaBasicOne51();
        System.out.println(javaBasicOne51.getValueToInt(value));
    }

    private Integer getValueToInt(String value) {
        return Integer.parseInt(value);
    }
}

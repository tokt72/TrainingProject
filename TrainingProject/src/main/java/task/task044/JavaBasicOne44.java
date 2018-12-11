package task.task044;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. Инициализировать переменную, которая принимает с клавиатуры целые числа
 *2. Написать метод который производит вывод операции сложения вида: n+ nn + nnn,
 * где n - введеное число с клавиатуры
 */
public class JavaBasicOne44 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine());
        JavaBasicOne44 javaBasicOne44 = new JavaBasicOne44();
        javaBasicOne44.InputValue(value);
    }

    private void InputValue(int value) {

        System.out.println("Input number: " + value);
        System.out.printf("%d  + %d%d   + %d%d%d", value, value, value, value, value, value);
    }
}

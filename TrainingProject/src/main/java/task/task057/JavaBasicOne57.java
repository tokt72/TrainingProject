package task.task057;


/* 1. Инициализировать переменную типа int которая принимает ввод с клавиатуры
 *  2. Написать метод который принимает на вход int, и раскладывает
 *  принятое число на множители
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasicOne57 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input an integer: ");

        int value = Integer.parseInt(br.readLine());

        JavaBasicOne57 javaBasicOne57 = new JavaBasicOne57();
        System.out.println(javaBasicOne57.getFactorsNumber(value));

    }

    private int getFactorsNumber(int value) {
        int count = 0;
        for (int i = 1; i <= value; ++i) {
            if (value % i == 0) {
                count++;
            }
        }
        return count;
    }
}

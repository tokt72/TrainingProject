package task.task057;


/* 1. Инициализировать переменную типа int которая принимает ввод с клавиатуры
 *  2. Написать метод который принимает на вход int, который раскладывает
 *  принятое число на факторы()????
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
        javaBasicOne57.getFactorsNumber(value);

    }
        //TODO to discuss this task 
    private int getFactorsNumber(int value) {

        return value;
    }
}

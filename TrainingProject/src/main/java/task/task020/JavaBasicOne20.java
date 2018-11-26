package task.task020;

/**
 * 1. инициализировать переменные decNum
 * 2. присвоить decNum значение(считывание с клавиатуры строки, преобразование в int)
 * 3. написать метод который преобразовывает числа из десятиричной системы счисления в шестнадцатиричную
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasicOne20 {


    public static void main(String args[]) throws IOException {

        int decNum, tempResult;
        String hexdecNum = "";

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a decimal number: ");
        decNum = Integer.parseInt(br.readLine());

        while (decNum > 0) {
            tempResult = decNum % 16;
            hexdecNum = hex[tempResult] + hexdecNum;
            decNum = decNum / 16;
        }
        System.out.print("Hexadecimal number is: " + hexdecNum);
    }
}

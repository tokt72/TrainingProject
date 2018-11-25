package task.task020;

/*
    1. инициализировать переменную
    2. присвоить ей значение(считывание с клавиатуры строки, преобразование в int)
    3. написать метод который преобразовывает числа из десятиричной системы счисления в шестнадцатиричную
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasicTwenty {


    public static void main(String args[]) throws IOException {

        int decNum, rem;
        String hexdecNum = "";

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a decimal number: ");
        decNum = Integer.parseInt(br.readLine());

        while (decNum > 0) {
            rem = decNum % 16;
            hexdecNum = hex[rem] + hexdecNum;
            decNum = decNum / 16;
        }
        System.out.print("Hexadecimal number is : " + hexdecNum + "\n");
    }
}

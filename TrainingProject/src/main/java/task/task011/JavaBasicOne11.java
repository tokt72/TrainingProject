package task.task011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. инициализировать переменную R(радиус)
 * 2. написать метод который вычисляет длинну окружности
 * 3. Вывести результат на экран
 */
public class JavaBasicOne11 {

    private double valuePi = 3.14;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius = Double.parseDouble(br.readLine());
        JavaBasicOne11 javaBasicEleven = new JavaBasicOne11();
        System.out.println(javaBasicEleven.getLengthCircle(radius));

    }

    public double getLengthCircle(double radius) {
        double c = 2 * radius * valuePi;
        return c;
    }
}
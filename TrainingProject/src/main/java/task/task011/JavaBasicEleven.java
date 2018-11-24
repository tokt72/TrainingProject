package task.task011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 1. инициализировать переменную R(радиус)
   2. написать метод который вычисляет длинну окружности
*/
public class JavaBasicEleven {

    private double valuePi = 3.14;

    public static void main(String args[]) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double radius = Double.parseDouble(br.readLine());
            JavaBasicEleven javaBasicEleven = new JavaBasicEleven();
            System.out.println(javaBasicEleven.getLengthCircle(radius));
        } catch (NullPointerException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double getLengthCircle(double radius) {
        double c = 2 * radius * valuePi;
        return c;
    }
}
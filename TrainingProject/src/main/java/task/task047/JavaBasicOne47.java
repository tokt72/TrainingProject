package task.task047;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Написать программу которая выводит текущее время и дату в заданном формате
 * 1. задать формат будущей даты
 * 2. Вывести в консоль "Current Date time:  текущая дата в заданном формате"
 * */

public class JavaBasicOne47 {

    public static void main(String[] args) {

        JavaBasicOne47 javaBasicOne47 = new JavaBasicOne47();
        javaBasicOne47.сurrentDateIsDisplay();

    }

    private void сurrentDateIsDisplay() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:m:s zxz yyyy");
        System.out.println("Current Date time: " + dateFormat.format(new Date()));

    }
}

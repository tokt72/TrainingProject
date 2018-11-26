package task.task1_7;

/*
 *   1. Инициализировать две переменные
 *   2. Присвоить им значение 50, 3
 *   3. Создать метод деления двух чисел
 *   4. Вывести результат деления на консоль
 */

public class JavaBasicOne3 {

    public static void main(String args[]) {

        JavaBasicOne3 javaBasicOne3 = new JavaBasicOne3();
        System.out.println(javaBasicOne3.divide(50, 3));
    }

    public int divide(int a, int b) {
        int c = a / b;
        return c;
    }
}

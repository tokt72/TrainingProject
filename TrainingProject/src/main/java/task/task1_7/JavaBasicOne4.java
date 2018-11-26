package task.task1_7;

/*  1. Инициализировать переменные: a,b,c,d
*   2. Записать в каждую переменную результат арифметических операций:
*   -5 + 8 * 6, (55 + 9) % 9, 20 + -3 * 5 / 8, 5 + 15 / 3 * 2 - 8 % 3;
*   3. Результат вычисления вывести в консоль(каждый результат с новой строки)
* */
public class JavaBasicOne4 {

    public static void main(String args[]) {

        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
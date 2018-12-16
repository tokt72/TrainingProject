package task.task050;

/*
 * написать три метода
 * - первый метод выводит на печать числа от 1 до 100 которые деляться на 3
 * - второй метод выводит на печать числа от 1 до 100 которые делятся на 5
 * - третий метод выводит на печать числа от 1 до 100 которые делятся и на 3 и 5
 *
 * Пример вывода "Divided by 3:"
 * */

public class JavaBasicOne50 {

    public static void main(String[] args) {

        JavaBasicOne50 javaBasicOne50 = new JavaBasicOne50();
        javaBasicOne50.getNumbersDividedByThree();
        javaBasicOne50.getNumbersDividedByFive();
        javaBasicOne50.getNumbersDividedByThreeAndFive();

    }

    private void getNumbersDividedByThree() {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    private void getNumbersDividedByFive() {
        System.out.println("\nDivided by 5: ");
        for (int i = 1; i < 101; i++) {

            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    private void getNumbersDividedByThreeAndFive() {
        System.out.println("\nDivided by 3 and 5: ");
        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}

package tasks.task01;

public class JavaBasicSix {

    int c;

    public static void main(String args[]) {
        JavaBasicSix javaBasicSix = new JavaBasicSix();
        System.out.println(javaBasicSix.sum(125, 24));
        System.out.println(javaBasicSix.multiply(125, 24));
        System.out.println(javaBasicSix.subtract(125, 24));
        System.out.println(javaBasicSix.divide(125, 24));
        System.out.println(javaBasicSix.remainder(125, 24));
    }

    private int sum(int a, int b) {
        c = a + b;
        return c;
    }

    private int multiply(int a, int b) {
        c = a - b;
        return c;
    }

    private int subtract(int a, int b) {
        c = a * b;
        return c;
    }

    private int divide(int a, int b) {
        c = a / b;
        return c;
    }

    private int remainder(int a, int b) {
        c = a % b;
        return c;
    }
}

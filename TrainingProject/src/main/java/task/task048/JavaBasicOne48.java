package task.task048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaBasicOne48 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число \"от\":");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Теперь введите число \"до\":");
        int b = Integer.parseInt(br.readLine());

        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                System.out.println("Sample Output: " + i + " ");
            }
        }
    }
}

package lesson6;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();

        long f = 1;
        for (int k = 1; k < n + 1; k ++) {
            f = f * k;
        }
        System.out.println("Факториал " + n + " = " + f);
    }
}

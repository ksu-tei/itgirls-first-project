package lesson6;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        String result = n % 2 == 0 ? "Четное" : "Нечетное";
        System.out.println("Число " + n + " " + result);
    }
}

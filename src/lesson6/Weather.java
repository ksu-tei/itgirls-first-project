package lesson6;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        System.out.println ("Ты можешь написать пять вариантов погоды");
        int i = 0;
        while (i < 5) {
            System.out.println ("Какая сейчас погода? ");
            Scanner inputInt = new Scanner(System.in);
            int weather = inputInt.nextInt();
            if (weather < 0) {
                System.out.println ("Сейчас очень холодно");
            }
            else if (weather < 16) {
                System.out.println ("Сейчас прохладно");
            }
            else {
                System.out.println ("Отличный летний денек!");
            }
            i += 1;
        }

    }
}

package lesson5;

import javax.swing.*;
import java.util.Objects;

public class Parrot extends AbstractAnimal {
    @Override
    void voice() {
        System.out.println("Я попугай и я повторяю за всеми");
    }

    @Override
    void walk() {
        System.out.println("Я попугай и я могу ходить");
    }

    @Override
    void fly() {
        System.out.println("Я попугай и я могу летать");
    }

    @Override
    void eat(String food) {
        System.out.println("Я попугай и я ем " + food);
    }

    @Override
    void feedMe(String food) {
        if (Objects.equals(food, "Семечки")) {
            System.out.println("Я попугай и я люблю есть семечки");
            eat(food);
        }
        else {
            System.out.println("Я попугай и такое я не ем (" + food +')');
        }
    }
}

package lesson5;

import java.util.Objects;

public class Lion extends AbstractAnimal {
    @Override
    void voice() {
        System.out.println("Я лев и я  рычу");
    }

    @Override
    void walk() {
        System.out.println("Я лев и я могу ходить");
    }

    @Override
    void eat(String food) {
        System.out.println("Я лев и я ем " + food);
    }

    void feedMe(String food) {
        if (Objects.equals(food, "Мясо")) {
            System.out.println("Я лев и я люблю есть мясо");
            eat(food);
        }
        else {
            System.out.println("Я лев и такое я не ем (" + food +')');
        }
    }

    void play(String animal){
        System.out.println("Я лев и готов играть с "+ animal);
    }

}

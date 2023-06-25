package lesson5;

public class Fish extends AbstractAnimal{
    @Override
    void voice() {
        System.out.println("Я рыба и я молчу");
    }

    @Override
    void walk() {
        System.out.println("Я рыба и я не могу ходить, я только плаваю");
    }
}

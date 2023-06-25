package lesson5;

public class Tiger extends AbstractAnimal{

    @Override
    void voice() {
        System.out.println("Я тигр и я рычу рррррр");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Я тигр, я умею не только ходить, но еще и очень быстро бегать");
    }
}
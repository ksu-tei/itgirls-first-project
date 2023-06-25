package lesson5;

public abstract class AbstractAnimal {
    abstract void voice();

    void walk() {
        System.out.println("Я животное и умею ходить");
    }

    void fly() {
        System.out.println("Я животное и умею летать");
    }
    void eat(String food) {
        System.out.println("Я животное и я ем " + food);
    }
    void feedMe(String food) {
        System.out.println("Я животное и я хочу есть " + food);
    }

    void play(String animal){
        System.out.println("Я животное и я могу играть с  " + animal);
    }
}
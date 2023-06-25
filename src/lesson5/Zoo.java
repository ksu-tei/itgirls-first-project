package lesson5;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Fish fish = new Fish();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();

        System.out.println("Сейчас смотритель за животными попросит выполнить команду ГОЛОС");
        System.out.println("----------------------------");
        zookeeper.makeVoid(fish);
        System.out.println("----------------------------");
        zookeeper.makeVoid(tiger);
        System.out.println("----------------------------");
        zookeeper.makeVoid(cow);
        System.out.println("----------------------------");

        System.out.println("Сейчас смотритель за животными попросит выполнить команду ГОЛОС");
        System.out.println("----------------------------");
        zookeeper.makeWalk(fish);
        System.out.println("----------------------------");
        zookeeper.makeWalk(tiger);
        System.out.println("----------------------------");
        zookeeper.makeWalk(cow);
        System.out.println("----------------------------");


        Parrot parrot = new Parrot();
        Lion lion = new Lion();
//        Cow cow = new Cow();


        zookeeper.makeFeed(parrot, "Семечки");
        zookeeper.makeFeed(parrot, "Яблоко");
        zookeeper.makeFeed(lion, "Трава");
        zookeeper.makeFeed(lion, "Мясо");
        zookeeper.makeFeed(lion, "Мясо");
        zookeeper.makePlay(lion, "Тигром");

    }
}

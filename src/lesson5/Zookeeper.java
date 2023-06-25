package lesson5;

public class Zookeeper {

    void makeVoid(AbstractAnimal abstractAnimal){
        System.out.println("Я смотритель за животными в зоопарке и сейчас я попрошу животное выполнить команду ГОЛОС");
        abstractAnimal.voice();
    }

    void makeWalk(AbstractAnimal abstractAnimal){
        System.out.println("Я смотритель за животными и сейчас я поведу животное на прогулку");
        abstractAnimal.walk();
    }

    void makeFeed(AbstractAnimal abstractAnimal, String food){
        System.out.println("Я смотритель за животными и сейчас я покормлю животных");
        abstractAnimal.feedMe(food);
    }

    void makePlay(AbstractAnimal abstractAnimal, String anotherAnimal){
        System.out.println("Я смотритель за животными и сейчас я попрошу животных поиграть вместе");
        abstractAnimal.play(anotherAnimal);
    }
}
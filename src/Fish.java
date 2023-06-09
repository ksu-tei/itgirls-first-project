public class Fish implements Swimable{
    @Override
    public void swim() {
       eat();
       System.out.println("Рыбка поела и поплыла");
    }

    private void eat(){
        System.out.println("Поем и поплыву");
    }
}

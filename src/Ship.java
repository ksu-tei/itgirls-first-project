public class Ship implements Swimable{
    @Override
    public void swim() {
        fuel();
        System.out.println("Заправили и поплыли");
    }

    private void fuel(){
        System.out.println("Заправляемся");
    }
}

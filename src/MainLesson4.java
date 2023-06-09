public class MainLesson4 {
    public static void main(String[] args) {

        Fish nemo = new Fish();
        Ship ship = new Ship();

        SwimExecutor swimExecutor = new SwimExecutor();

        swimExecutor.makeSwim(nemo);
        swimExecutor.makeSwim(ship);

    }
}

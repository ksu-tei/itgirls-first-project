package lesson6;

public class SequenceOutput {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            System.out.print((int)Math.pow(2, i) + " ");
            i += 1;
        }
        System.out.println();
        System.out.println("Теперь наоборот");

        do{
            i -= 1;
            System.out.print((int)Math.pow(2, i) + " ");
        } while (i > 0);


    }
}

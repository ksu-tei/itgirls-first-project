import static java.lang.Math.sqrt;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        byte ab = 5;
        System.out.println("b = " + ab);
        short ac = 10;
        System.out.println("c = " + ac);
        long d = 2000;
        System.out.println("d = " + d);
        float e = 2.17F;
        System.out.println("e = " + e);
        double f = 2.17;
        System.out.println("f = " + f);
        char g = 'g';
        System.out.println("g = " + g);
        boolean i = true;
        System.out.println("i = " + i);
        String k = "Hello";
        System.out.println("k = " + k);

        // 2. Задайте для переменной byte, short, float значения, выходящие за диапазон их максимальных.
        // Проанализируйте возникшие ошибки.
//        byte l = -130;
        byte l = -128;
        System.out.println("l = " + l);
//        short m = 32768;
        short m = 32767;
        System.out.println("m = " + m);
//        float n = 3.5E+38F;
        float n = 3.4E+38F;
        System.out.println("n = " + n);

        // 3. Присвойте переменной типа char букву ‘ы’ тремя разными способами. Выведите значение на экран.
        // Подсказка: воспользуйтесь таблицей UTF-8, ссылка на которую приведена в данной главе.
        char o = 'ы';
        System.out.println("o = " + o);
        char p = 1099;
        System.out.println("p = " + p);
        char r = '\u044B';
        System.out.println("r = " + r);

        // 4. Напечатайте любую строку, используя объявление переменной типа String.
        // Объявите её двумя разными способами, описанными в главе.
        String s = new String("String s");
        System.out.println("s = " + s);
        String t = "String t";
        System.out.println("t = " + t);

        // 5. Выполните упаковку каждого примитива в соответствующую ему обёртку разными способами
        // и обратную распаковку.
        Integer u = 10;
        Boolean v = true;

        long y = 123446457674L;
        Long x;
        x = new Long(y);
        System.out.println("x = " + x);
        x = Long.valueOf(y);
        System.out.println("x = " + x);

        Character boxed = 'a';
        char ca;
        ca = boxed.charValue();         //явная распаковка
        ca = boxed;                    //автоматическая распаковка

        Float boxedF = 2.1F;
        float fb;
        fb = boxedF.floatValue();         //явная распаковка
        fb = boxedF;

        // 6. Решите задачу с помощью программы. Известны катеты прямоугольного треугольника:
        // основание = 5, боковая сторона = 8, найдите его площадь и периметр и выведите на экран.
        // Периметр больше 15? Площадь меньше 30? Выясните это в программе и выведите результат
        // на экран.
        int osn = 5;
        int bok = 8;
        double square = (double) (osn * bok) / 2;
        System.out.println("square = " + square);
        double perimetr = osn + bok + sqrt(osn*osn + bok*bok);
        System.out.println("perimetr = " + perimetr);

        // 7. Даны переменные b = 50, c = 20. Увеличьте b на 1, затем уменьшите c на 1,
        // используя унарные операции. Выведите на экран проверку условия:
        // b больше либо равно 51 **или** с меньше 22, используя логическую операцию.
        int b = 50;
        int c = 20;
        b++;
        c--;
        if (b > 50 && c < 22)
        {
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }
        //8. Дана строка «Training Java». Выведите на экран её длину и символ, который
        // стоит на 5 позиции, а затем добавьте к ней строку с сегодняшним числом и
        // выведите результат на экран.
        String str = "Training Java";
        System.out.println("Length of String = " + str.length());
        System.out.println("Fifth symbol in the String = " + str.charAt(4));
        System.out.println(str + " 03/06/2023");
    }

}
package lesson6;

public class WeekDays {
    enum Weekdays {MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    public static void main(String[] args) {
        for (Weekdays weekday : Weekdays.values()) {
            switch (weekday) {
                case SATURDAY:
                    System.out.println(weekday + " Сейчас выходной");
                    break;
                case SUNDAY:
                    System.out.println(weekday + " Сейчас выходной");
                    break;
                default:
                    System.out.println(weekday + " Сейчас будний день");
                    break;
            }
        }

    }
}

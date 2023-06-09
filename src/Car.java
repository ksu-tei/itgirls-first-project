import static java.lang.Math.abs;

public class Car {
    String color;
    String brand;
    int speed;

    public Car(){
        this.speed = 0;
    }
    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.speed = 0;
    }

    public Car(String color, String brand, int speed) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
    }
    public String speedUp(int km){
        if (km < 0){
            System.out.println(this.brand + " Пытается затормозить..");
            if (abs(km) > this.speed){
                this.speed = this.speed + km;
                return " едет назад со скоростью " + abs(this.speed) + "км/ч";
            }
            else{
                this.speed = this.speed + km;
                return " снизил скорость до " + (this.speed) + "км/ч";
            }
        } else {
            System.out.println(this.brand + " Ускоряется на " + km + "км/ч");
            this.speed = this.speed + km;
            return " Едет со скоростью " + (this.speed) + "км/ч";
        }
    }

    public String speedLow(int km){
        if (km == this.speed){
            this.speed -= km;
            return " остановилась";
        }
        if (km < 0){
            System.out.println("Перепутаны педали.. разгоняемся");
            this.speed -= km;
            return " разгоняется до " + this.speed + "км/ч";
        } else if (km > this.speed) {
            System.out.println("Начинаем ехать назад");
            this.speed -=km;
            return " едет назад со скоростью " + abs(this.speed) + "км/ч";
        } else{
            this.speed -=km;
            return " замедляется до скорости " + abs(this.speed) + "км/ч";
        }
    }

    public static void main(String[] args) {
        Car ford = new Car("red", "Ford");
        Car nissan = new Car("blue", "Nissan");
        Car citroen = new Car();
        citroen.color = "yellow";
        citroen.brand = "Citroen";
        citroen.speed = 20;

        System.out.println("Cars:");
        System.out.println("1. " + ford.color + ", " + ford.brand);
        System.out.println("2. " + nissan.color + ", " + nissan.brand);
        System.out.println("3. " + citroen.color + ", "+ citroen.brand);
        System.out.println(citroen.brand + citroen.speedUp(20));
        System.out.println(citroen.brand + citroen.speedUp(-20));
        System.out.println(citroen.brand + citroen.speedUp(-40));


        System.out.println(nissan.brand + nissan.speedUp(40));
        System.out.println(nissan.brand + nissan.speedLow(40));
        System.out.println(nissan.brand + nissan.speedLow(40));
        System.out.println(nissan.brand + nissan.speedUp(60));

        System.out.println(ford.brand + ford.speedUp(20));
        System.out.println(ford.brand + ford.speedLow(10));
    }

}
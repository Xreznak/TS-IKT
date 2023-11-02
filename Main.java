import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Car car = new Car("Toyota");
    Bicycle bicycle = new Bicycle("Mountain");

      car.start();
      bicycle.start();

      car.accelerate(30);
      bicycle.accelerate(15);

      car.brake(20);
      bicycle.brake(5);

      car.stop();
      bicycle.stop();
    }


    }
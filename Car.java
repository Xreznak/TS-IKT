public class Car extends Vehicle{
    private String type;
    private int speed;
    public Car(String type){
        this.type = type;
        this.speed = 0;
    }

    public void start(){
        System.out.println(type+" car is starting");
    }
    public void stop(){
        System.out.println(type+" car is stopping");
    }
    public void accelerate(int speed){
        this.speed += speed;
        System.out.println(type+" car is accelerating to "+ this.speed + "km/h");
    }

    public void brake(int speed){
        this.speed -= speed;
        System.out.println(type+" car is slowing down to "+ this.speed + "km/h");
    }
}
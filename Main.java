public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Miki", 6);
        Cat cat = new Cat("Jahoda", 2);

        System.out.println("Dog:");
        dog.displayInfo();
        dog.makeSound();

        System.out.println("\nCat:");
        cat.displayInfo();
        cat.makeSound();

        Rectangle rectangle = new Rectangle("\nMoj rectangel", 5,8);
        rectangle.displayInfo();

        Circle circle = new Circle("\nMoj circel", 3);
        circle.displayInfo();
    }
}
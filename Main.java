public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dunčo", 3);
        Cat cat = new Cat("Ares", 7);

        System.out.println();
        System.out.println("Pes:");
        dog.displayInfo();
        dog.makeSound();

        System.out.println();
        System.out.println("Macka:");
        cat.displayInfo();
        cat.makeSound();

        System.out.println();
        Rectangle rectangle = new Rectangle("Moj obdlznik", 3,3);
        rectangle.displayInfo();

        System.out.println();
        Circle circle = new Circle("Moj kruh", 6);
        circle.displayInfo();
    }
}
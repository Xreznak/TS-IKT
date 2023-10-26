abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
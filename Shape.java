abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public void displayInfo() {
        System.out.println("Meno: " + name);
        System.out.println("\tPlocha: " + area());
        System.out.println("\tObvod: " + perimeter());
    }
}
interface Beverage {
    String getDescription();
    double getPrice();
}

enum BikeType implements Beverage {
    GHOST("Ghost", 1099),
    KELLYS("Kellys", 2049),
    KTM("KTM", 2029),
    DEMA("Dema", 2019);

    private String description;
    private double price;

    BikeType(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class BikeBrand {
    public static void main(String[] args) {
        System.out.println("vyberas si bicykel");

        BikeType kupeny_bike = BikeType.KTM;
        System.out.println("Objednali ste: " + kupeny_bike.getDescription());
        System.out.println("Cena: " + kupeny_bike.getPrice() + " eur");

        BikeType dalsi_bicykel = BikeType.KELLYS;
        System.out.println("Objednali ste: " + dalsi_bicykel.getDescription());
        System.out.println("Cena: " + dalsi_bicykel.getPrice() + " eur");
    }
}
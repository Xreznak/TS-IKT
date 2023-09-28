public class main {
    public static void main(String[] args){
        Clovek c1 = new Clovek("Fero", 20, 10);
        System.out.println(c1.getVek());
        c1.setVek(30);
        System.out.println(c1.getVek());

        System.out.println(c1.getMeno());
        c1.setMeno("Adam");
        System.out.println(c1.getMeno());
    }

}

public class main {
    public static void main (String[] args){
        Clovek c1 = new Clovek("Fero", 20, 10);
        Clovek c2 = new Clovek("Jano", 50, 13);
        System.out.println(c1.getVek());
        c1.setVek(30);
        System.out.println(c1.getVek());

        System.out.println(c1.getMeno());
        c1.setMeno("Adam");
        System.out.println(c1.getMeno());

        c1.porovnajVek();
        c2.porovnajVek();

        c1.vypisCisla(10);
    }

}

import java.util.ArrayList;
import java.util.Collections;

public class Zamestnec {
    private static String[] Zamestnec;
    String meno;
    int vek;
    String pozicia;

    public Zamestnec(String meno, int vek, String pozicia) {
        this.meno = meno;
        this.vek = vek;
        this.pozicia = pozicia;
    }

    public static void main(String[] args) {
        Zamestnec z1 = new Zamestnec("Ján", 30, "manažér");
        Zamestnec z2 = new Zamestnec("Peter", 25, "programátor");
        Zamestnec z3 = new Zamestnec("Eva", 28, "dizajnér");

        ArrayList<Zamestnec> zamestnanci = new ArrayList<>();
        zamestnanci.add(z1);
        zamestnanci.add(z2);
        zamestnanci.add(z3);

        System.out.println("Počet zamestnancov: " + zamestnanci.size());

        Zamestnec z4 = new Zamestnec("Mária", 32, "analytik");
        Zamestnec z5 = new Zamestnec("Lukáš", 27, "testovač");

        Collections.addAll(zamestnanci, z4, z5);

        System.out.println("Počet zamestnancov po pridaní: " + zamestnanci.size());

        for (Zamestnec z : zamestnanci) {
            System.out.println(z.meno + " " + z.vek + " " + z.pozicia);
        }
    }
}
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Uloha_1.zretazenie();
        Uloha_1.dlzka();
        Uloha_1.porovnanie();
        Uloha_1.hladaj_podretazec();
        Uloha_1.velke_pismena();

        Uloha_2.male_pismena();
        Uloha_2.bez_medzier();
        Uloha_2.rozdel_retazec();
        Uloha_2.zamenenie_znaku();
        Uloha_2.palindrom();

    Zamestnanec[] zamestnanci = new Zamestnanec[2];

        for(int i = 0; i < 2; i++)
        {
            System.out.println("\nZadaj meno zamestnanca: " + (i + 1) + ": ");
            String meno = scanner.nextLine();
            System.out.println("Zadaj vek zamestnanca: " + (i + 1) + ": ");
            int vek = scanner.nextInt();
            System.out.println("Zadaj id zamestnanca: " + (i + 1) + ": ");
            int id = scanner.nextInt();
            System.out.println("Zadaj plat zamestnanca: " + (i + 1) + ": ");
            int plat = scanner.nextInt();

            zamestnanci[i] = new Zamestnanec(meno, vek, id, plat);
        }

        System.out.println("Zamestnanci:");
        for (Zamestnanec poradie :zamestnanci)
        {
            System.out.println("Meno: " + poradie.meno + " Vek: " + poradie.vek + " ID: " + poradie.id + " Plat: " + poradie.plat);
        }

    }
}


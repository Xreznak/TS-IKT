import java.util.Scanner;

public class Uloha_2 {
    public static void male_pismena() {
        String retazec = ("Ahoj Jano");

        System.out.println("\nmale_pismena");
        System.out.println("Zadaný reťazec:" + retazec);

        System.out.println("Reťazec s malými písmenami:" + retazec.toLowerCase());
    }

    public static void bez_medzier() {
        String retazec = ("Ahoj Jano");

        System.out.println("\nbez_medzier");
        System.out.println("Zadaný reťazec:" + retazec);

        String bez_medzier = retazec.replaceAll(" ","");
        System.out.println("Reťazec bez medzier: "+ bez_medzier);
    }

    public static void rozdel_retazec() {
        String retazec = ("Ahoj Jano");

        System.out.println("\nrozdel_retazec");
        System.out.println("Zadaný reťazec:" + retazec);


        String[] rozdel = retazec.split(" ");

        System.out.println("Slová z reťazca:");
        for(String retazec_rozdeleny : rozdel)
        {
            System.out.println(retazec_rozdeleny);
        }
    }

    public static void zamenenie_znaku() {
        String retazec_1 = ("Ahoj Jano");
        String znak_povodny = ("J");
        String znak_zmeneny = ("Z");

        System.out.println("\nrozdel_retazec");
        System.out.println("Zadaný reťazec:" + retazec_1);
        System.out.println("Pôvodný znak:" + znak_povodny);
        System.out.println("Zmenený znak:" + znak_zmeneny);

        String retazec_2 = retazec_1.replaceAll(znak_povodny,znak_zmeneny);
        System.out.println("Zmenený reťazec: "+ retazec_2);
    }

    public static void palindrom() {

        String retazec = ("Ahoj johA");
        String retazec_z_predu = retazec.replaceAll(" ","").toLowerCase();
        String retazec_zo_zadu = new StringBuilder(retazec_z_predu).reverse().toString() ;

        System.out.println("\npalindrom");
        System.out.println("Zadaný reťazec:" + retazec);

        if(retazec_z_predu.equals(retazec_zo_zadu))
        {
            System.out.println("Zadaný reťazec je palindróm");
        }
        else
        {
            System.out.println("Zadaný reťazec nie je palindróm");
        }
    }
}
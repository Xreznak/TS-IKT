import java.util.Scanner;

public class Uloha_1 {

    public static void zretazenie() {
        String retazec_1 = ("Ahoj Jano");
        String retazec_2 = (" ako sa mas?");
        String retazec_3 = retazec_1 + retazec_2;
        System.out.println("Spojený retazec: "+ retazec_3);
    }

    public static void dlzka() {
        String retazec_1 = ("Ahoj Jano");
        int dlzka = retazec_1.length();
        System.out.println("Dĺžka reťazca je: "+ dlzka);
    }

    public static void porovnanie() {
        String retazec_1 = ("Ahoj Jano");
        String retazec_2 = ("Ahoj Jano");
        if (retazec_1.equals(retazec_2))
        {
            System.out.println("Reťazce sú rovnaké");
        }
        else
        {
            System.out.println("Reťazce nie sú rovnaké");
        }
    }

    public static void hladaj_podretazec() {
        String zadany_retazec = ("Ahoj Jano");
        String hladany_retazec = ("Jano");

        if(zadany_retazec.contains(hladany_retazec))
        {
            System.out.println(hladany_retazec+" sa nachádza v zadanom reťazci.");
        }else
        {
            System.out.println(hladany_retazec+" sa nenachádza v zadanom reťazci.");
        }
    }

    public static void velke_pismena() {
        String retazec = ("Ahoj Jano");
        System.out.println(retazec.toUpperCase());
    }
}

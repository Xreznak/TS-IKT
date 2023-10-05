public class Uloha_1 {
    public static void primeNumber(int cislo) {
        System.out.println("Prvocislo");
        if ( cislo == 2 || cislo % 2 != 0) {
            System.out.println(cislo + " => True");
        }
        else System.out.println(cislo +" => False");
    }

    public static void faktorial(int fac_cislo)
    {
        System.out.println("Factorial");
        int vysledok = 1;
        for(int i = 1; i <= fac_cislo;i++)
        {
            vysledok = vysledok * i;
        }
        System.out.println("Factorial " + fac_cislo + " => " + vysledok);
    }
}
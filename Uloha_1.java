public class Uloha_1 {
    public static void primeNumber(int cislo) {
        System.out.println("Prvocislo");
        if ( cislo == 2 || cislo % 2 != 0) {
            System.out.println(cislo + " => True");
        }
        else System.out.println(cislo +" => False");
    }

    public static void faktorial(int fac_cislo) {
        System.out.println("Factorial");
        int j = fac_cislo;
        for(int i = 1; i<=fac_cislo;i++){
            j = j*i;
        }
        System.out.println("Factorial " + fac_cislo + " = " + j);
    }
}
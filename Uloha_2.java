public class Uloha_2
{
    public static void sumAll(int sum_cislo)
    {
        int vysledok = 0;
        System.out.println("sumAll");
        for(int i = 1; i <= sum_cislo;i++)
        {
            vysledok = vysledok + i;
        }
        System.out.println("sumAll " + sum_cislo + " => " + vysledok);
    }
}
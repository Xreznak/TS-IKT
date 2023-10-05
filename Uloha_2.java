public class Uloha_2
{
    public static void sumAll(int sum_cislo)
    {
        int a = 0;
        System.out.println("sumAll");
        for(int i = sum_cislo; i > 0; i--)
        {
            for(int j = 1; j < sum_cislo; j++)
            {
                a = a + j ;
            }
            System.out.println(i + "->" + a);
            a = 0;
            sum_cislo--;
        }
    }
}
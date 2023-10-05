public class Uloha_4
{
    public static void fibonacci(int max)
    {
        int predpredminula = 0;
        int predminula = 1;
        int minula = 1;
        int sucasna;

        System.out.println("Fibunaciho postupnost");
        System.out.print(max + " => ");

        for(int i = 0; i<max; i++)
        {
            System.out.print(predpredminula + ", ");

            sucasna = predpredminula + predminula + minula;
            predpredminula = predminula;
            predminula = minula;
            minula = sucasna;
        }
    }
}
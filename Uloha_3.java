import java.io.IOException;
import java.util.Scanner;
public class Uloha_3
{
    public static void calculator_a()
    {
        System.out.println("calculator_a");

        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj dve čísla: ");
        int parameter_1 = vstup.nextInt();
        int parameter_2 = vstup.nextInt();

        int scitanie = parameter_1 + parameter_2;
        int odcitanie = parameter_1 - parameter_2;
        int nasobenie = parameter_1 * parameter_2;
        int delenie = parameter_1 / parameter_2;
        System.out.print(parameter_1 + ", " + parameter_2 + " => "+ scitanie + ", " + odcitanie + ", " + nasobenie+ ", " + delenie);
    }
    public static void calculator_b()
    {

        Scanner vstup = new Scanner(System.in);
        System.out.println("calculator_b");
        int parameter_1 = vstup.nextInt();
        int parameter_2 = vstup.nextInt();

        int scitanie = parameter_1 + parameter_2;
        int odcitanie = parameter_1 - parameter_2;
        int nasobenie = parameter_1 * parameter_2;
        int delenie;
        if(parameter_2 == 0 || parameter_1 == 0)
        {
            System.out.println("Cislom 0 sa neda delit");
        }
        else
        {
            delenie = parameter_1 / parameter_2;
            System.out.print(parameter_1 + ", " + parameter_2 + " => "+ scitanie + ", " + odcitanie + ", " + nasobenie+ ", " + delenie);
        }
    }

    public static void calculator_c() throws IOException
    {
        System.out.println("calculator_c");
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadaj dve čísla: ");
        int parameter_1 = vstup.nextInt();
        int parameter_2 = vstup.nextInt();

        System.out.println("Zadaj čo chceš robiť (+,-,*,/) :");
        char mat_operacia = (char) System.in.read();

        if( mat_operacia == '+')
        {
            int scitanie = parameter_1 + parameter_2;
            System.out.print(scitanie);
        }
        else if (mat_operacia == '-')
        {
            int odcitanie = parameter_1 - parameter_2;
            System.out.println(odcitanie);
        }
        else if (mat_operacia == '*')
        {
            int nasobenie = parameter_1 * parameter_2;
            System.out.println(nasobenie);
        }
        else if (mat_operacia == '/')
        {
            if(parameter_2 == 0 || parameter_1 == 0)
            {
                System.out.println("Cislom 0 sa neda delit");
            }
            else
            {
                int delenie = parameter_1 / parameter_2;
                System.out.println(delenie);
            }
        }
        else System.out.println("Zadal si zlý vstup :)");
    }
}
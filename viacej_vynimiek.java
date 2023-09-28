import java.util.InputMismatchException;
import java.util.Scanner;
public class viacej_vynimiek {

    public static int readIntiger(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Zadaj celé číslo: ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Nezadal si číslo.");
                scanner.nextLine();
            }
        }
    }
    public static void main(String[] args) {
        int cislo = readIntiger();
        System.out.println("Napisal si: " + cislo);
    }
}

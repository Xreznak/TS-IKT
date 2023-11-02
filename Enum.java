import java.util.Scanner;
public class Enum {
    public enum RočnéObdobie {
        ZIMA, JAR, LETO, JESEŇ
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte mesiac (1-12): ");
        int mesiac = scanner.nextInt();
        RočnéObdobie obdobie = zistiRočnéObdobie(mesiac);
        System.out.println("Ročné obdobie pre mesiac " + mesiac +" je " + obdobie);
        scanner.close();
    }
    public static RočnéObdobie zistiRočnéObdobie(int mesiac) {
        if (mesiac == 1 || mesiac == 2 || mesiac == 12) {
            return RočnéObdobie.ZIMA;
        } else if (mesiac >= 3 && mesiac <= 5) {
            return RočnéObdobie.JAR;
        } else if (mesiac >= 6 && mesiac <= 8) {
            return RočnéObdobie.LETO;
        } else if (mesiac >= 9 && mesiac <= 11) {
            return RočnéObdobie.JESEŇ;
        } else {
            return null;
        }
    }
}
public class main {
        public static void main(String[] args) {
                int cislo = 5;
                System.out.println("Prvocislo");
                if (cislo % 2 != 0) {
                        System.out.println(cislo + " => True");
                }
                else System.out.println(cislo +" =>False");
////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println();
                System.out.println("Factorial");
                int fac_cislo = 5;
                        int j = 1;
                        for(int i = 1; i<=fac_cislo;i++){
                                j = j*i;
                        }
                System.out.println("Factorial " + fac_cislo + " = " + j);
////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println();
                System.out.println("SumALL");
                int sum = 0;
                int sum_cislo = 5;
                for(int i = 1; i<=fac_cislo;i++){
                        j = j*i;
                }
                System.out.println("Factorial " + fac_cislo + " = " + j);
////////////////////////////////////////////////////////////////////////////////////////////
                int predpredminula = 0;
                int predminula = 1;
                int minula = 1;
                int max = 6;

                System.out.println();
                System.out.println("Fibunaciho postupnost");
                System.out.print(max + " => ");
                for(int i = 0; i<max; i++) {
                        System.out.print(predpredminula + ", ");
                        int sucasna = predpredminula + predminula + minula;
                        predpredminula = predminula;
                        predminula = minula;
                        minula = sucasna;
                }

        }
}

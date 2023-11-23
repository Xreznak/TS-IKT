public class knihy
{
    private final String nazov_knihy;
    private final int pocet_stran;
    private final String autor;
    private final double cena;

    private knihy(KnihaBuilder builder)
    {
        this.nazov_knihy = builder.nazov_knihy;
        this.pocet_stran = builder.pocet_stran;
        this.autor = builder.autor;
        this.cena = builder.cena;
    }

    //zobrazenie vypisu
    public String toString()
    {
        return "Nazov knihy: "+this.nazov_knihy+", Autor: "+this.autor+", Cena: "+this.cena+" €, Počet strán: "+this.pocet_stran;
    }

    //implementovanie rozhrania bulder
    public static class KnihaBuilder
    {
        private final String nazov_knihy;
        private int pocet_stran;
        private String autor;
        private double cena;

        public KnihaBuilder(String nazov_knihy)
        {
            this.nazov_knihy = nazov_knihy;
        }
        public KnihaBuilder autor(String autor)
        {
            this.autor = autor;
            return this;
        }
        public KnihaBuilder cena(double cena)
        {
            this.cena = cena;
            return this;
        }
        public KnihaBuilder pocet_stran(int pocet_stran)
        {
            this.pocet_stran = pocet_stran;
            return this;
        }
        public knihy build()
        {
            return new knihy(this);
        }
    }

    // zobrazenie a naplnenie pomocou builder
    public static void main(String[] args)
    {
        knihy kniha_1 = new knihy.KnihaBuilder("Harry Potter and the Philosopher’s Stone")
                .autor("J. K. Rowling")
                .cena(39.95)
                .pocet_stran(368)
                .build();
        System.out.println(kniha_1);

        knihy kniha_2 = new knihy.KnihaBuilder("Metro 2033")
                .autor("Dmitry Glukhovsky")
                //No cena
                .pocet_stran(352)
                .build();
        System.out.println(kniha_2);

        knihy kniha_3 = new knihy.KnihaBuilder("Základy moderní informatiky")
                //No autor
                //No cena
                //no pocet stran
                .build();
        System.out.println(kniha_3);
    }
}